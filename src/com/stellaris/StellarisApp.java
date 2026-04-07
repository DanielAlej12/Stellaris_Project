package com.stellaris;

import com.stellaris.core.NaveEspacial;
import com.stellaris.factory.NaveFactory;
import com.stellaris.state.*;
import com.stellaris.adapter.*;
import java.util.*;

public class StellarisApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> bitacora = new ArrayList<>();

        System.out.println("=== BIENVENIDO A LA AGENCIA STELLARIS ===");
        
        // 1. CONFIGURACIÓN
        System.out.print("Ingrese el nombre de la misión: ");
        String nombreMision = sc.nextLine();

        System.out.print("¿Cómo se llamará tu nave?: ");
        String nombreNave = sc.nextLine();
        
        System.out.println("Selecciona el chasis:\n1. Exploradora (Ligera/Veloz)\n2. Carguero (Pesado/Resistente)\n3. Científico (Escaneo/Análisis)");
        int tipoInt = Integer.parseInt(sc.nextLine());
        
        NaveEspacial nave = NaveFactory.crearNave(tipoInt, nombreNave);
        bitacora.add("Misión '" + nombreMision + "' iniciada con la nave: " + nave.getNombre());

        // 2. PREPARACIÓN
        System.out.println("\n--- Fase de Preparación de la Misión: " + nombreMision + " ---");
        AdaptadorSoporteVital soporte = new AdaptadorSoporteVital(new SistemaOxigenoExterno());
        soporte.conectar();
        nave.ejecutarCiclo();

        // 3. SIMULACIÓN
        boolean enMision = true;
        while (enMision && nave.getEnergia() > 0) {
            System.out.println("\n[ MISIÓN: " + nombreMision + " | Nave: " + nave.getNombre() + " | Energía: " + nave.getEnergia() + "% ]");
            System.out.println("1. Salto Hiperespacial");
            System.out.println("2. Ejecutar Acción Especial");
            System.out.println("3. Recolectar Muestras");
            System.out.println("4. Reparaciones de Emergencia");
            System.out.println("5. Finalizar Misión");
            System.out.print("Seleccione actividad: ");
            
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    nave.setEstado(new EstadoEnVuelo());
                    nave.ejecutarCiclo();
                    nave.consumirEnergia(10);
                    bitacora.add("Realizado salto hiperespacial.");
                    break;
                case "2":
                    nave.realizarAccionEspecial();
                    nave.consumirEnergia(15);
                    bitacora.add("Acción especial de " + nave.getClass().getSimpleName() + " ejecutada.");
                    break;
                case "3":
                    nave.recolectarMuestras();
                    nave.consumirEnergia(20);
                    bitacora.add("Muestras recolectadas con éxito.");
                    break;
                case "4":
                    nave.setEstado(new EstadoEmergencia());
                    nave.ejecutarCiclo();
                    nave.consumirEnergia(-15);
                    System.out.println("Reparando sistemas... +15 energía.");
                    bitacora.add("Protocolo de reparación activado.");
                    break;
                case "5":
                    enMision = false;
                    break;
                default:
                    System.out.println("Comando inválido.");
            }
        }

        // 4. REPORTE FINAL
        System.out.println("\n--- BITÁCORA FINAL: MISIÓN " + nombreMision.toUpperCase() + " ---");
        bitacora.forEach(evento -> System.out.println("> " + evento));
        System.out.println("Resultado: La nave " + nave.getNombre() + " regresó con " + nave.getEnergia() + "% de energía.");
    }
}
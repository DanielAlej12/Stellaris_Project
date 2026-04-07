package com.stellaris.state;
import com.stellaris.core.NaveEspacial;

public class EstadoEmergencia implements EstadoMision {
    public void ejecutar(NaveEspacial n) { System.out.println("ESTADO: ¡ALERTA en " + n.getNombre() + "! Energía crítica."); }
}
package com.stellaris.factory;
import com.stellaris.core.NaveEspacial;

public class Carguero extends NaveEspacial {
    public Carguero(String nombre) { super(nombre); }

    @Override
    public void realizarAccionEspecial() { 
        System.out.println("[" + nombre + "] Desplegando drones de carga. Capacidad al 95%."); 
    }

    @Override
    public void recolectarMuestras() {
        System.out.println("[" + nombre + "] Cargando contenedores de combustible helio-3.");
    }
}
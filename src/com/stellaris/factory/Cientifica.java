package com.stellaris.factory;
import com.stellaris.core.NaveEspacial;

public class Cientifica extends NaveEspacial {
    public Cientifica(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarAccionEspecial() {
        System.out.println("[" + nombre + "] Analizando señales cósmicas y tomando lecturas de sensores.");
    }

    @Override
    public void recolectarMuestras() {
        System.out.println("[" + nombre + "] Registrando datos biológicos y minerales.");
    }
}
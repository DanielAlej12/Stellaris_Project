package com.stellaris.factory;
import com.stellaris.core.NaveEspacial;

public class Exploradora extends NaveEspacial {
    public Exploradora(String nombre) { super(nombre); }
    
    @Override
    public void realizarAccionEspecial() { 
        System.out.println("[" + nombre + "] Escaneando cuadrante... ¡Planeta habitable detectado!"); 
    }

    @Override
    public void recolectarMuestras() {
        System.out.println("[" + nombre + "] Extrayendo núcleos de hielo y minerales raros.");
    }
}
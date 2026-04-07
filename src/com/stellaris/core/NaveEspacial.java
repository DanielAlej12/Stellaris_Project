package com.stellaris.core;

import com.stellaris.state.EstadoMision;
import com.stellaris.state.EstadoPreparacion;

public abstract class NaveEspacial {
    protected String nombre;
    protected int energia = 100;
    protected EstadoMision estadoActual;

    public NaveEspacial(String nombre) {
        this.nombre = nombre;
        this.estadoActual = new EstadoPreparacion();
    }

    public abstract void realizarAccionEspecial();
    public abstract void recolectarMuestras();

    public void setEstado(EstadoMision estado) { this.estadoActual = estado; }
    public void ejecutarCiclo() { estadoActual.ejecutar(this); }
    
    public String getNombre() { return nombre; }
    public int getEnergia() { return energia; }
    public void consumirEnergia(int cantidad) { this.energia -= cantidad; }
}
package com.stellaris.state;
import com.stellaris.core.NaveEspacial;

public class EstadoPreparacion implements EstadoMision {
    public void ejecutar(NaveEspacial n) { System.out.println("ESTADO: Nave " + n.getNombre() + " en hangar (Sistemas OK)."); }
}
package com.stellaris.state;
import com.stellaris.core.NaveEspacial;

public class EstadoEnVuelo implements EstadoMision {
    public void ejecutar(NaveEspacial n) { System.out.println("ESTADO: " + n.getNombre() + " navegando en el vacío."); }
}
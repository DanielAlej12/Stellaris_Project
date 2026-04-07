package com.stellaris.factory;
import com.stellaris.core.NaveEspacial;

public class NaveFactory {
    public static NaveEspacial crearNave(int tipo, String nombre) {
        if (tipo == 1) {
            return new Exploradora(nombre);
        } else if (tipo == 2) {
            return new Carguero(nombre);
        } else if (tipo == 3) {
            return new Cientifica(nombre);
        } else {
            return null;
        }
    }
}

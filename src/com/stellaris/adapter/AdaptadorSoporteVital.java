package com.stellaris.adapter;

public class AdaptadorSoporteVital {
    private SistemaOxigenoExterno sistema;
    public AdaptadorSoporteVital(SistemaOxigenoExterno s) { this.sistema = s; }
    public void conectar() { sistema.iniciar(); }
}
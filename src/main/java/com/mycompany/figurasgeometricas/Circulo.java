package com.mycompany.figurasgeometricas;

/**
 *
 * @author Alejandro López
 */
public class Circulo extends FiguraGeometrica {
// complejidad temporal O(1)
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}

package com.mycompany.figurasgeometricas;

/**
 *
 * @author Alejandro López
 */
public class FiguraGeometrica {
// complejidad temporal O(1)
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double obtenerArea() {
        return 0;
    }

    public double obtenerPerimetro() {
        return 0;
    }
}

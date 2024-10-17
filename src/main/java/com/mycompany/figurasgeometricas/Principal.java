package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {
    // complejidad temporal O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = sc.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipo = sc.nextInt();

        FiguraGeometrica figura = null;

        switch (tipo) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radio = sc.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = sc.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = sc.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("El área de la figura es: " + figura.obtenerArea());
        System.out.println("El perímetro de la figura es: " + figura.obtenerPerimetro());
    }
    
}

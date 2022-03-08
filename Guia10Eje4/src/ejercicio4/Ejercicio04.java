package ejercicio4;

import java.text.DecimalFormat;

public class Ejercicio04 {

    public static void main(String[] args) {

        DecimalFormat formatoConDosDecimales = new DecimalFormat("#.00");

        System.out.println("Creamos círculo de 3,5 de radio.");
        Circulo circulo = new Circulo(3.5);
        System.out.println("Área del círculo: " + formatoConDosDecimales.format(circulo.calcularArea()));
        System.out.println("Perímetro del círculo: " + formatoConDosDecimales.format(circulo.calcularPerimetro()));

        System.out.println("");
        System.out.println("Creamos un rectángulo de 4,3 de base y 8,6 de altura.");
        Rectangulo rectangulo = new Rectangulo(4.3, 8.6);
        System.out.println("Área del rectángulo: " + formatoConDosDecimales.format(rectangulo.calcularArea()));
        System.out.println("Perímetro del rectángulo: " + formatoConDosDecimales.format(rectangulo.calcularPerimetro()));
    }

}

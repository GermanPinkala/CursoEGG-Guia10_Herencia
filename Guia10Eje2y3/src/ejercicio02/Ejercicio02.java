/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.text.DecimalFormat;

/**
 *
 * @author mirod
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat formatoConDosDecimales = new DecimalFormat("#.##");
        Televisor televisor = new Televisor();
        Lavadora lavadora = new Lavadora();

        System.out.println("CREACION DEL TELEVISOR");
        televisor.crearTelevisor();
        System.out.println(televisor.toString());
        televisor.precioFinal();
        System.out.println("Precio final del televisor: $ " + formatoConDosDecimales.format(televisor.getPrecio()));
        System.out.println("");

        System.out.println("CREACION DE LA LAVADORA");
        lavadora.crearLavadora();
        System.out.println(lavadora.toString());
        System.out.println("");
        lavadora.precioFinal();
        System.out.println("Precio final de la lavadora: $ " + formatoConDosDecimales.format(lavadora.getPrecio()));

    }

}

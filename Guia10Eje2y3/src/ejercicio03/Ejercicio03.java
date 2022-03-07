/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.ArrayList;
import ejercicio02.Electrodomestico;
import ejercicio02.Lavadora;
import ejercicio02.Televisor;
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        Double totalElectrodomesticos, totalTelevisores, totalLavadoras;
        totalElectrodomesticos = totalTelevisores = totalLavadoras = 0d;

        Televisor tele1 = new Televisor(43d, true, 1000d, 2d, "negro", 'B');
        Televisor tele2 = new Televisor(22d, false, 1000d, 22d, "amarillo", 'e');

        Lavadora lavadora1 = new Lavadora(35, 1000d, 50d, "blanco", 'j');
        Lavadora lavadora2 = new Lavadora(25, 1000d, 85d, "azul", 'd');

        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);

        for (Electrodomestico electrodomestico : electrodomesticos) {

            if (electrodomestico instanceof Televisor) {
                Televisor object = (Televisor) electrodomestico;
                object.precioFinal();
                System.out.println("Precio del televisor: " + object.getPrecio());
                totalTelevisores += object.getPrecio();
                continue;
            }
            if (electrodomestico instanceof Lavadora) {
                Lavadora object = (Lavadora) electrodomestico;
                object.precioFinal();
                System.out.println("Precio de la lavadora: " + object.getPrecio());
                totalLavadoras += object.getPrecio();
                continue;
            }

        }
        totalElectrodomesticos = totalLavadoras + totalTelevisores;
        
        System.out.println("Precio total de televisores: " + totalTelevisores);
        System.out.println("Precio total de lavadora: " + totalLavadoras);
        System.out.println("Precio total de electrodomésticos: " + totalElectrodomesticos);
        
    }

}

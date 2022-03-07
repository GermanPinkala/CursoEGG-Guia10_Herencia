/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Win 10
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.alimentarse();
        
        Animal perro1 = new Perro("Teddy", "Crequetas", 10, "Chihuahua");
        perro1.alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
        
        System.out.println(perro.toString());
        
    }
    
}

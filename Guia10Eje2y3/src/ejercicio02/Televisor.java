/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private Double resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Double precio, Double peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        char respuesta;
        super.crearElectrodomestico();
        System.out.print("Ingrese resolución: ");
        this.resolucion = leer.nextDouble();

        /*System.out.println("¿Tiene sintonizador TDT? Y/N: ");
        respuesta = leer.next().charAt(0);
        if (respuesta == 'Y') {
            this.sintonizadorTDT = true;
        }else if(respuesta =='N'){
            this.sintonizadorTDT = false;
        }*/
        boolean banderaCarga = true;

        do {

            System.out.print("¿Tiene sintonizador TDT? Y/N: ");
            respuesta = Character.toUpperCase(leer.next().charAt(0));

            if (respuesta == 'N') {
                this.sintonizadorTDT = false;
                banderaCarga = false;
            } else if (respuesta == 'Y') {
                this.sintonizadorTDT = true;
                banderaCarga = false;
            } else {
                System.out.print("Respuesta incorrecta, vuelva a intentarlo. ");
                System.out.println("");
            }

        } while (banderaCarga);

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio += this.precio * 0.3;
        }
        if (sintonizadorTDT) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Electrodomestico {
    
    protected Double precio;
    protected Double peso;
    protected String color;
    protected char consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Double peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    private void comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        List<Character> consumos = Arrays.asList('A', 'B', 'C', 'D', 'E');
        if (!consumos.contains(letra)){
            this.consumoEnergetico = 'F';
        }else{
            this.consumoEnergetico = letra;
        }
    }
    
    private void comprobarColor(String color){
        List<String> colores = Arrays.asList("negro","rojo","azul","gris");
        if (!colores.contains(color.toLowerCase())){
            this.color = "blanco";
        }else{
            this.color = color.toLowerCase();
        }
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       
        String colorIngresado;
        char consumo;
        System.out.print("Ingrese el peso del electrodomestico: ");
        this.peso = leer.nextDouble();
        System.out.print("Ingrese el color: ");
        colorIngresado = leer.next();
        comprobarColor(colorIngresado);
        System.out.print("Ingrese el consumo energetico: ");
        consumo = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        this.precio = 1000d;
        
    }
    
    public void precioFinal(){
        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000d;
                break;
            case 'B':
                this.precio += 800d;
                break;
            case 'C':
                this.precio += 600d;
                break;
            case 'D':
                this.precio += 500d;
                break;
            case 'E':
                this.precio += 300d;
                break;
            case 'F':
                this.precio += 100d;
                break;
            default:
                throw new AssertionError();
        }
        
        if (this.peso>0 && this.peso<20){
            this.precio += 100;
        } else if (this.peso>=20 && this.peso<50){
            this.precio += 500;
        } else if (this.peso>=50 && this.peso<80){
            this.precio += 800;
        } else if (this.peso>=80){
            this.precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }
    
    
    
}

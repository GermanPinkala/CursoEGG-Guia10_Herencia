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
public class Animal {

    private String nombre, alimento, razaDelAnimal;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento,int edad, String razaDelAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.razaDelAnimal = razaDelAnimal;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRazaDelAnimal() {
        return razaDelAnimal;
    }

    public void setRazaDelAnimal(String razaDelAnimal) {
        this.razaDelAnimal = razaDelAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void alimentarse(){
        System.out.println("Alimento: " + this.alimento);
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre: " + nombre + ", alimento: " + alimento + ", razaDelAnimal: " + razaDelAnimal + ", edad: " + edad + '}';
    }
    
    

}

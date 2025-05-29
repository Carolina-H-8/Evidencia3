package org.example;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected String genero;
    protected double estatura;
    protected double peso;

    public Persona(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;

    }
    public String getNombre() {
        return nombre;
    }
    public void ImprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("FechaNacimiento: " + fechaNacimiento);
        System.out.println("Genero: " + genero);
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
    }

}

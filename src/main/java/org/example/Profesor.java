package org.example;

import java.util.ArrayList;

public class Profesor extends Persona {
    private static Profesor[] listaProfesores = new Profesor[50];
    private static int contador = 0;
    private String Curso;

    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.Curso = Curso;
    }

    public void TDA(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso) {
        if (contador < listaProfesores.length) {
            listaProfesores[contador] = new Profesor(nombre, apellido, fechaNacimiento, genero, estatura, peso);
            contador++;
        }else {
            System.out.printf("Limite de datos alcanzado");
        }
    }






}

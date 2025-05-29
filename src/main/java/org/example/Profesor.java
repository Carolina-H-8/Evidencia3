package org.example;

public class Profesor extends Persona {
    private static Profesor[] listaProfesores = new Profesor[50];
    private static int contador = 0;
    private String Curso;

    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso, String Curso) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.Curso = Curso;
    }

    public static void TDA(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso, String Curso) {
        if (contador < listaProfesores.length) {
            listaProfesores[contador] = new Profesor(nombre, apellido, fechaNacimiento, genero, estatura, peso, Curso);
            contador++;
        }else {
            System.out.printf("Limite de datos alcanzado");
        }
    }
    public static void mostarDatos() {
        for(int i=0; i<listaProfesores.length; i++){
            Profesor p = listaProfesores[i];
            System.out.println(p.getNombre() +"Curso : "+p.Curso);
        }
    }






}

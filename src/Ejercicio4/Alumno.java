package Ejercicio4;

public class Alumno {
    String nombre;
    int edad;
    double nota;

    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Nota: " + nota;
    }
}

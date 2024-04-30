package Ejercicio1_v2;

import java.util.List;

public class Asignatura {
    private int aula;
    private String hora;
    private String nombre;
    private Profesor profesor; // Asociación con la clase Profesor
    private Grupo grupo; // Asociación con la clase Grupo

    // Getters y Setters
    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}

package Ejercicio5;

public class Tarea {
    String descripcion;
    int priority;

    public Tarea(String descripcion, int priority) {
        this.descripcion = descripcion;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Descripcion: " + descripcion + "; Prioridad: " + priority;
    }
}

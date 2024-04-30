package Ejercicio5;

import java.util.*;

public class ListaDeTareas implements Iterable<Tarea>{
    private List<Tarea> tareas;

    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }
    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
        this.tareas.sort(Comparator.comparingInt((Tarea t) -> t.priority).reversed());
    }

    public void eliminarTarea(String descripcion) {
        tareas.removeIf(t -> t.descripcion.equals(descripcion));
    }

    @Override
    public Iterator<Tarea> iterator() {
        return tareas.iterator();
    }
}
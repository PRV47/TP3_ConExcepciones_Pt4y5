package Ejercicio2;

public class Empleado {
    String nombre;
    Empleado supervisor;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.supervisor = null;
    }

    public void asignarSupervisor (Empleado supervisor){
        this.supervisor = supervisor;
    }

    public String obtenerNombreSupervisor () {
        if (this.supervisor == null){
            return ("Sin supervisor");
        } else {
            return this.supervisor.nombre;
        }
    }
}

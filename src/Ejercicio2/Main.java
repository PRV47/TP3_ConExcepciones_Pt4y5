package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Piers Rideout");
        Empleado empleado2 = new Empleado("Juan Lopez");

        System.out.println("Informacion de " + empleado1.nombre);
        System.out.printf("Supervisor: ");
        System.out.println(empleado1.obtenerNombreSupervisor());
        System.out.println(" ");

        System.out.println("Nuevo supervisor agregado");
        empleado1.asignarSupervisor(empleado2);
        System.out.println(" ");

        System.out.println("Informacion de " + empleado1.nombre);
        System.out.printf("Supervisor: ");
        System.out.println(empleado1.obtenerNombreSupervisor());

    }
}

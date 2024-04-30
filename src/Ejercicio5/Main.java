package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        String choice;

        do {
            System.out.println("Elija una opcion del 1 - 4: ");
            System.out.println("1- Agregar una nueva tarea a la lista, especificando su descripcion y prioridad.");
            System.out.println("2- Mostrar todas las tareas de la lista, en orden de prioridad descendiente.");
            System.out.println("3- Eliminar una tarea especifica de la lista, especificando su descripcion.");
            System.out.println("4- Salir del programa.");
            choice = reader.nextLine();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("Describa la tarea: ");
                        String descripcion = reader.nextLine();
                        System.out.print("Cual es la prioridad de dicha tarea: ");
                        int priority = reader.nextInt();
                        reader.nextLine();
                        listaDeTareas.agregarTarea(new Tarea(descripcion, priority));
                        System.out.println(" ");
                        System.out.println("--------------");
                        System.out.println(" ");
                    } catch ( InputMismatchException e ) {
                        System.out.println("Por favor, ingresa un número válido para la prioridad.");
                        reader.nextLine();
                    }
                case "2":
                    for (Tarea tarea : listaDeTareas){
                        System.out.println(tarea);
                    }
                    System.out.println(" ");
                    System.out.println("--------------");
                    System.out.println(" ");
                    break;
                case "3":
                    System.out.printf("Describe la tarea que quiere eliminar: ");
                    String descripcionDelete = reader.nextLine();
                    listaDeTareas.eliminarTarea(descripcionDelete);
                    System.out.println(" ");
                    System.out.println("--------------");
                    System.out.println(" ");
                    break;
                case "4":
                    System.out.println("Terminando ejecucion");
                    break;
                default:
                    System.out.println("Opcion invalida, debe ser un numero del 1 - 4");
                    System.out.println(" ");
                    System.out.println("--------------");
                    System.out.println(" ");
            }

        } while (!choice.equals("4"));
    }
}
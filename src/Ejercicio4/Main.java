package Ejercicio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        String choice;

        do {
        System.out.println("Elija una opcion escribiendo solo un numero 1 - 6: ");
        System.out.println("1- Agregar alumno");
        System.out.println("2- Mostrar alumnos");
        System.out.println("3- Calcular media de notas");
        System.out.println("4- Mostrar alumno don nota más alta");
        System.out.println("5- Buscar alumno por nombre");
        System.out.println("6- Salir");
        System.out.print(" ");
        choice = reader.nextLine();

        switch (choice) {
            case "1":
                try {
                    System.out.print("Nombre del alumno: ");
                    String nombre = reader.nextLine();
                    System.out.print("Edad de " + nombre + ": ");
                    int edad = reader.nextInt();
                    System.out.print("Nota de " + nombre + ": ");
                    double nota = reader.nextDouble();
                    reader.nextLine();
                    alumnos.add(new Alumno(nombre, edad, nota));
                    System.out.println(" ");
                    System.out.println("--------------");
                    System.out.println(" ");
                } catch (InputMismatchException e ) {
                    System.out.println("Ingresa solo datos validos para la edad y la nota");
                    reader.nextLine();
                }
                break;
            case "2":
                for (int i = 0; i < alumnos.size(); i++){
                    System.out.println(alumnos.get(i));
                }
                System.out.println(" ");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case "3":
                try {
                    double suma = 0;
                    for (Alumno alumno : alumnos) {
                        suma = suma + alumno.nota;
                    }
                    System.out.println("Media de las notas: " + suma/alumnos.size());
                    System.out.println(" ");
                    System.out.println("--------------");
                    System.out.println(" ");
                } catch (ArithmeticException e) {
                    System.out.println("No hay alumnos en la lista");
                }
                break;
            case "4":
                Alumno mejorAlumno = alumnos.get(0);
                for (Alumno alumno : alumnos) {
                    if (alumno.nota > mejorAlumno.nota) {
                        mejorAlumno = alumno;
                    }
                }
                System.out.println("El alumno con la nota más alta es " + mejorAlumno);
                System.out.println(" ");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case "5":
                System.out.print("Ingrese el nombre del alumno que desea buscar: ");
                String nombreBusqueda = reader.nextLine();
                for (Alumno alumno : alumnos) {
                    if (alumno.nombre.equalsIgnoreCase(nombreBusqueda)) {
                        System.out.println(alumno);
                        break;
                    }
                }
                System.out.println(" ");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case "6":
                System.out.println("Finalizado el programa");
                break;
            default:
                System.out.println("Opción invalida. Debe ser un numero del 1 al 6");
            }
        } while (!choice.equals("6"));
    }
}
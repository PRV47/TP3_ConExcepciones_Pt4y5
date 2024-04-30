package Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> semana = new ArrayList<String>();
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");

        System.out.println("Inserta en la posición 4 el elemento “Juernes");
        semana.set(4, "Juernes");
        System.out.println(" ");

        System.out.println("Muestra el contenido de las posiciones 3 y 4 de la lista");
        System.out.println(semana.get(3));
        System.out.println(semana.get(4));
        System.out.println(" ");

        System.out.println("Muestra el primer elemento y el último de la lista.");
        System.out.println(semana.get(0));
        System.out.println(semana.get(semana.size()-1));
        System.out.println(" ");

        System.out.println("Elimina el elemento que contenga “Juernes” de la lista y comprueba que haya sido eliminado");
        int cont = 0;
        for (int i = 0; i < semana.size(); i++){
            if (semana.get(i) == "Juernes"){
                semana.remove(i);
            }
        }
        for (int i = 0; i < semana.size(); i++){
            if (semana.get(i) == "Juernes"){
                System.out.println("El elemento sigue en la lista");;
            } else {
                System.out.println("El elemenot 'Juernes' fue eliminado exitosamente");
            }
        }


        System.out.println("Crea un iterador y muestras uno a uno los valores de la lista.");
        for (int i = 0; i < semana.size(); i++){
            System.out.println(semana.get(i));
        }
        System.out.println(" ");

        System.out.println("Busca si existe en la lista un elemento que se denomine “Lunes”.");
        for (int i = 0; i < semana.size(); i++){
            if (semana.get(i) == "Lunes"){
                System.out.println("El elemento 'Lunes' esta en la posicion " + i);;
            }
        }
        System.out.println(" ");

        System.out.println("Busca si existe en la lista un elemento que se denomine “Lunes”. No importa si está en mayúscula o minúscula");
        String buscar = "Lunes";
        boolean result = semana.stream().anyMatch(buscar::equalsIgnoreCase);
        if (result == true){
            System.out.println("El elemento se encuentra en la lista");
        } else {
            System.out.println("El elemento no existe en la lista");
        }
        System.out.println(" ");

        System.out.println("Borra todos los elementos de la lista");
        semana.clear();

    }
}

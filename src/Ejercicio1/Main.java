package Ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Profesor profesor = new Profesor();
        profesor.setDni(123456789);
        profesor.setNombre("Neira");
        profesor.setDepartamento("Metodologia");

        Grupo grupo = new Grupo();
        grupo.setCurso("2024");
        grupo.setLetra('B');

        Alumno alumno = new Alumno();
        alumno.setDni(94731431);
        alumno.setNombre("Piers Rideout");
        alumno.setGrupos(Arrays.asList(grupo));

        List<Alumno> alumnosDelGrupo = new ArrayList<>();
        alumnosDelGrupo.add(alumno);
        grupo.setAlumnos(alumnosDelGrupo);

        System.out.println("a. Teniendo un objeto de Profesor, muestre el aula de la 3ra. asignatura.");

        Asignatura asignatura1 = new Asignatura();
        asignatura1.setAula(101);
        asignatura1.setHora("8:00");
        asignatura1.setNombre("Metodologia");
        asignatura1.setProfesor(profesor);
        asignatura1.setGrupo(grupo);

        Asignatura asignatura2 = new Asignatura();
        asignatura2.setAula(102);
        asignatura2.setHora("10:30");
        asignatura2.setNombre("Programacion 2");
        asignatura2.setProfesor(profesor);
        asignatura2.setGrupo(grupo);

        Asignatura asignatura3 = new Asignatura();
        asignatura3.setAula(103);
        asignatura3.setHora("12:00");
        asignatura3.setNombre("Estadistica");
        asignatura3.setProfesor(profesor);
        asignatura3.setGrupo(grupo);

        System.out.println("El aula de la tercera asignatura es: " + asignatura3.getAula());

        System.out.println("b. Teniendo un profesor, muestre todos los nombres de las asignaturas que imparte.");

        List<Asignatura> asignaturas = Arrays.asList(asignatura1, asignatura2, asignatura3);

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getProfesor().equals(profesor)) {
                System.out.println(asignatura.getNombre());
            }
        }

        System.out.println("c. Teniendo una asignatura, muestre nombre y dni de los alumnos del grupo que recibe.");

        Grupo grupoDeLaAsignatura = asignatura1.getGrupo();
        alumnosDelGrupo = grupoDeLaAsignatura.getAlumnos();

        for (Alumno alumnoDelGrupo : alumnosDelGrupo) {
            System.out.println("Nombre: " + alumnoDelGrupo.getNombre() + ", DNI: " + alumnoDelGrupo.getDni());
        }

        System.out.println("e. Teniendo un alumno, muestre todas las asignaturas recibidas por el 1er. grupo al que pertenece.");
        Grupo primerGrupoDelAlumno = alumno.getGrupos().get(0);

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getGrupo().equals(primerGrupoDelAlumno)) {
                System.out.println(asignatura.getNombre());
            }
        }

        System.out.println("f. Teniendo un objeto de Alumno y, pidiendo por pantalla, una asignatura existente, muestre desde él, el profesor que la imparte.");
        System.out.print("Ingresa el nombre de una asignatura: ");
        String nombreAsignatura = reader.nextLine();

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                Profesor profesorDeLaAsignatura = asignatura.getProfesor();
                System.out.println("El profesor que imparte la asignatura " + nombreAsignatura + " es: " + profesorDeLaAsignatura.getNombre());
                break;
            } else {
                System.out.println("No existe una asignatura " + nombreAsignatura);
                break;
            }
        }

        System.out.println("g. Teniendo un objeto de Profesor, muestre los nombres de todos los alumnos inscriptos en el Grupo de la 2da. Asignatura.");
        Asignatura segundaAsignatura = asignaturas.get(1);

        if (segundaAsignatura.getProfesor().equals(profesor)) {
            Grupo grupoDeLaSegundaAsignatura = segundaAsignatura.getGrupo();

            alumnosDelGrupo = grupoDeLaSegundaAsignatura.getAlumnos();

            for (Alumno alumnoDelGrupo : alumnosDelGrupo) {
                System.out.println(alumnoDelGrupo.getNombre());
            }
        } else {
            System.out.println("El profesor no imparte la segunda asignatura.");
        }


        System.out.println("h. Responda: ¿En qué se diferencian una asociación de una composición y de una agregación?");
        System.out.println("Asociacion: Es la relación más general y se utiliza para describir una interaccion entre dos clases sin implicar ninguna propiedad de propiedad o ciclo de vida.");
        System.out.println("Agregacion: Es un tipo especial de asociacion que representa una relacion de “tiene-un” o “forma-parte-de”. En la agregacion, las clases están relacionadas, pero pueden existir independientemente.");
        System.out.println("Composicion: Es un tipo aún más especifico de agregacion que implica una relacion de propiedad fuerte y exclusiva entre las clases. En la composicion, si la clase contenedora se destruye, también se destruiran las clases contenidas.");

    }
}

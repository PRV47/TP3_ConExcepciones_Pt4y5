package Ejercicio1_v2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Crear un objeto de la clase Profesor
        Profesor profesor = new Profesor();
        profesor.setDni(12345678);
        profesor.setNombre("Juan Pérez");
        profesor.setDepartamento("Matemáticas");

        // Crear un objeto de la clase Grupo
        Grupo grupo = new Grupo();
        grupo.setCurso("2024");
        grupo.setLetra('A');

        // Crear un objeto de la clase Alumno
        Alumno alumno = new Alumno();
        alumno.setDni(87654321);
        alumno.setNombre("Ana Sánchez");
        alumno.setGrupos(Arrays.asList(grupo)); // El alumno pertenece al grupo creado

        // Añadir el alumno al grupo
        List<Alumno> alumnosDelGrupo = new ArrayList<>();
        alumnosDelGrupo.add(alumno);
        grupo.setAlumnos(alumnosDelGrupo); // El grupo tiene al alumno creado

        System.out.println("a. Teniendo un objeto de Profesor, muestre el aula de la 3ra. asignatura.");

        // Crear un objeto de la clase Asignatura
        Asignatura asignatura1 = new Asignatura();
        asignatura1.setAula(101);
        asignatura1.setHora("10:00");
        asignatura1.setNombre("Matemáticas Avanzadas");
        asignatura1.setProfesor(profesor); // La asignatura es impartida por el profesor creado
        asignatura1.setGrupo(grupo); // La asignatura es recibida por el grupo creado

        Asignatura asignatura2 = new Asignatura();
        asignatura2.setAula(102);
        asignatura2.setHora("11:00");
        asignatura2.setNombre("Física Avanzada");
        asignatura2.setProfesor(profesor);
        asignatura2.setGrupo(grupo);

        Asignatura asignatura3 = new Asignatura();
        asignatura3.setAula(103);
        asignatura3.setHora("12:00");
        asignatura3.setNombre("Química Avanzada");
        asignatura3.setProfesor(profesor);
        asignatura3.setGrupo(grupo);

        System.out.println("El aula de la tercera asignatura es: " + asignatura3.getAula());

        System.out.println("b. Teniendo un profesor, muestre todos los nombres de las asignaturas que imparte.");

        // Crear una lista de Asignaturas
        List<Asignatura> asignaturas = Arrays.asList(asignatura1, asignatura2, asignatura3);

        // Recorrer la lista de Asignaturas
        for (Asignatura asignatura : asignaturas) {
            // Verificar si la asignatura es impartida por el profesor
            if (asignatura.getProfesor().equals(profesor)) {
                // Mostrar el nombre de la asignatura
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
        // Supongamos que el alumno es 'alumno'
        Grupo primerGrupoDelAlumno = alumno.getGrupos().get(0); // Obtener el primer grupo al que pertenece el alumno

        // Recorrer la lista de Asignaturas
        for (Asignatura asignatura : asignaturas) {
            // Verificar si la asignatura es recibida por el primer grupo del alumno
            if (asignatura.getGrupo().equals(primerGrupoDelAlumno)) {
                // Mostrar el nombre de la asignatura
                System.out.println(asignatura.getNombre());
            }
        }

        System.out.println("f. Teniendo un objeto de Alumno y, pidiendo por pantalla, una asignatura existente, muestre desde él, el profesor que la imparte.");
        System.out.println("Por favor, ingresa el nombre de una asignatura:");
        String nombreAsignatura = reader.nextLine();

        // Buscar la asignatura en la lista de asignaturas
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                // Mostrar el profesor que imparte la asignatura
                Profesor profesorDeLaAsignatura = asignatura.getProfesor();
                System.out.println("El profesor que imparte la asignatura " + nombreAsignatura + " es: " + profesorDeLaAsignatura.getNombre());
                break;
            } else {
                System.out.println("No existe una asignatura " + nombreAsignatura);
                break;
            }
        }

        System.out.println("g. Teniendo un objeto de Profesor, muestre los nombres de todos los alumnos inscriptos en el Grupo de la 2da. Asignatura.");
        // Supongamos que el profesor es 'profesor'
        Asignatura segundaAsignatura = asignaturas.get(1); // Obtener la segunda asignatura

        // Verificar si la segunda asignatura es impartida por el profesor
        if (segundaAsignatura.getProfesor().equals(profesor)) {
            // Obtener el grupo que recibe la segunda asignatura
            Grupo grupoDeLaSegundaAsignatura = segundaAsignatura.getGrupo();

            // Obtener los alumnos del grupo
            alumnosDelGrupo = grupoDeLaSegundaAsignatura.getAlumnos();

            // Mostrar los nombres de los alumnos
            for (Alumno alumnoDelGrupo : alumnosDelGrupo) {
                System.out.println(alumnoDelGrupo.getNombre());
            }
        } else {
            System.out.println("El profesor no imparte la segunda asignatura.");
        }


        System.out.println("h. Responda: ¿En qué se diferencian una asociación de una composición y de una agregación?");
        System.out.println("Asociacion: Es la relación más general y se utiliza para describir una interacción entre dos clases sin implicar ninguna propiedad de propiedad o ciclo de vida.");
        System.out.println("Agregacion: Es un tipo especial de asociación que representa una relación de “tiene-un” o “forma-parte-de”. En la agregación, las clases están relacionadas, pero pueden existir independientemente.");
        System.out.println("Composicion: Es un tipo aún más específico de agregación que implica una relación de propiedad fuerte y exclusiva entre las clases. En la composición, si la clase contenedora se destruye, también se destruirán las clases contenidas.");

    }
}

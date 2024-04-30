package Ejercicio1_v2;

import java.util.List;

public class Alumno extends Persona {
    private List<Grupo> grupos; // Composición con la clase Grupo

    // Aquí puedes agregar los atributos específicos de la clase Alumno

    // Getters y Setters
    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    // Aquí puedes agregar los getters y setters de los atributos de la clase Alumno
}

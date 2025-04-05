package clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Inscripcion {
    List<Materia> materiasParaInscripcion;
    List<Materia> aprobadasDelAlumno;

    public Inscripcion(List<Materia> materiasPInscripcion, List<Materia> aprobadasDelAlumno){
        this.materiasParaInscripcion = new ArrayList<>(materiasPInscripcion);
        this.aprobadasDelAlumno = new ArrayList<>(aprobadasDelAlumno);
    }

    /* se asegura de que cada materia
        tenga sus correlativas en materiasAprobadas.*/
    boolean verificarMateria(Materia materia){
        List<Materia> correlativas = materia.listaDeCorrelativas;
        //Si el alumno tiene materias aprobadas,
        // en aprobadasDelAlumno deben aparecer todas las
        // correlativas de la materia.
        if (!aprobadasDelAlumno.isEmpty())
            return new HashSet<>(aprobadasDelAlumno).containsAll(correlativas);
        else
            // Si el alumno no aprobó ninguna materia,
            // solo va a poder anotarse a las materias
            // que no tengan correlativas, es decir,
            // aquellas con lista de correlativas vacía.
            return correlativas.isEmpty();
    }

    /*  devuelve true o false según el resultado del método
    verificarMateria para cada materia de la lista materiasParaInscripcion.*/
    boolean aprobada(){

        return materiasParaInscripcion.stream().filter(Objects::nonNull).allMatch(this::verificarMateria);
    }
}

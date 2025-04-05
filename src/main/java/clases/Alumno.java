package clases;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Alumno {
    String nombreCompleto;
    String nroLegajo;
    List<Materia> materiasAprobadas;

   /* En solicitarInscripcion se instancia a la clase Inscripcion inicializando las listas correspondientes.*/
    public boolean  solicitarInscripcion(List<Materia> materiasParaInscripcion){
        Inscripcion unaInscripcion = new Inscripcion(materiasParaInscripcion, materiasAprobadas);
        return unaInscripcion.aprobada();
    }
}

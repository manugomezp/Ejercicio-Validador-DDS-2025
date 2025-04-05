package clases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InscripcionTest {

    @Test
    @DisplayName("La solicitud del alumno fue aceptada.")
    public void testeoSolicitudDeInscripcionPositivo(){
        Materia AyED = new Materia("AyED", List.of());
        Materia SyO = new Materia("SyO", List.of());
        Materia PdP = new Materia("PdP", List.of(AyED));
        Materia AdS = new Materia("AdS", Arrays.asList(AyED, SyO));
        Materia AMI = new Materia("AMI",List.of());
        Materia DDS = new Materia("DDS", Arrays.asList(AyED, PdP, AdS));

        Alumno alumno = new Alumno();

        alumno.setNombreCompleto("Manuel Gomez");
        alumno.setNroLegajo("2036897");
        alumno.setMateriasAprobadas(Arrays.asList(SyO, AyED));

        Assertions.assertTrue(alumno.solicitarInscripcion(Arrays.asList(PdP,AMI,AdS)));
    }
    @Test
    @DisplayName("La solicitud del alumno fue rechazada.")
    public void testeoSolicitudDeInscripcionNegativo(){
        Materia AyED = new Materia("AyED", List.of());
        Materia SyO = new Materia("SyO", List.of());
        Materia PdP = new Materia("PdP", List.of(AyED));
        Materia AdS = new Materia("AdS", Arrays.asList(AyED, SyO));
        Materia AMI = new Materia("AMI",List.of());
        Materia DDS = new Materia("DDS", Arrays.asList(AyED, PdP, AdS));

        Alumno alumno = new Alumno();

        alumno.setNombreCompleto("Manuel Gomez");
        alumno.setNroLegajo("2036897");
        alumno.setMateriasAprobadas(Arrays.asList(SyO, AyED));

        Assertions.assertFalse(alumno.solicitarInscripcion(Arrays.asList(PdP, AMI, DDS)));
    }
}
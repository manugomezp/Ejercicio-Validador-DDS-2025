package clases;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Materia {
    String Nombre;
    List<Materia> listaDeCorrelativas;

    public Materia(String nombreMateria, List<Materia> correlativas){
        this.Nombre = nombreMateria;
        setListaDeCorrelativas(correlativas);
    }

}

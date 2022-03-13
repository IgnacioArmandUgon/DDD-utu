package domain.Orientación;

import co.com.sofka.domain.generic.Entity;
import domain.Grupo.Grupo;
import domain.Orientación.value.Duracion;
import domain.Orientación.value.IdOrientacion;

import java.util.ArrayList;

public class Orientacion extends Entity<IdOrientacion> {
    private Duracion duracion;
    private ArrayList<Materia> materias;
    private ArrayList<Grupo> grupos;

    public Orientacion(IdOrientacion idOrientacion, Duracion duracion, ArrayList<Materia> materias, ArrayList<Grupo> grupos) {
        super(idOrientacion);
        this.duracion = duracion;
        this.materias = materias;
        this.grupos = grupos;
    }
}

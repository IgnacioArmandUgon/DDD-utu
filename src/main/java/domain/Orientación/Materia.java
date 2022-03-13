package domain.Orientación;

import co.com.sofka.domain.generic.Entity;
import domain.Docente.Docente;
import domain.Grupo.value.Año;
import domain.Orientación.value.IdMateria;
import domain.Orientación.value.Programa;

import java.util.ArrayList;

public class Materia extends Entity<IdMateria> {
    private Año año;
    private ArrayList<Docente> docentes;
    private Programa programa;

    public Materia(IdMateria idMateria, Año año, ArrayList<Docente> docentes, Programa programa) {
        super(idMateria);
        this.año = año;
        this.docentes = docentes;
        this.programa = programa;
    }
}

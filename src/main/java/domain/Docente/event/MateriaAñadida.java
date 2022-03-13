package domain.Docente.event;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import domain.Docente.Docente;
import domain.Grupo.value.Año;
import domain.Orientación.value.IdMateria;
import domain.Orientación.value.Programa;

import java.util.ArrayList;

public class MateriaAñadida extends DomainEvent {

    private IdMateria idMateria;
    private Año año;
    private ArrayList<Docente> docentes;
    private Programa programa;

    public MateriaAñadida(IdMateria idMateria, Año año, ArrayList<Docente> docentes, Programa programa) {
        super("docente.event.materiaañadida");
        this.idMateria = idMateria;
        this.año = año;
        this.docentes = docentes;
        this.programa = programa;
    }

    public IdMateria idMateria() {
        return idMateria;
    }

    public Año año() {
        return año;
    }

    public ArrayList<Docente> docentes() {
        return docentes;
    }

    public Programa programa() {
        return programa;
    }
}
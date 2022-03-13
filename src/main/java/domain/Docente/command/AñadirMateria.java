package domain.Docente.command;

import co.com.sofka.domain.generic.Command;
import domain.Docente.Docente;
import domain.Grupo.value.Año;
import domain.Orientación.value.IdMateria;
import domain.Orientación.value.Programa;

import java.util.ArrayList;

public class AñadirMateria extends Command {

    private IdMateria idMateria;
    private Año año;
    private ArrayList<Docente> docentes;
    private Programa programa;

    public AñadirMateria(IdMateria idMateria, Año año, ArrayList<Docente> docentes, Programa programa) {
        this.idMateria = idMateria;
        this.año = año;
        this.docentes = docentes;
        this.programa = programa;
    }

    public IdMateria getIdMateria() {
        return idMateria;
    }

    public Año getAño() {
        return año;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public Programa getPrograma() {
        return programa;
    }
}
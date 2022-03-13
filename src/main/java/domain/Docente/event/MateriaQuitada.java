package domain.Docente.event;

import co.com.sofka.domain.generic.Command;
import domain.Docente.Docente;
import domain.Grupo.value.Año;
import domain.Orientación.value.IdMateria;
import domain.Orientación.value.Programa;

import java.util.ArrayList;

public class MateriaQuitada extends Command {


    private IdMateria idMateria;

    public MateriaQuitada(IdMateria idMateria, Año año, ArrayList<Docente> docentes, Programa programa) {
        this.idMateria = idMateria;
    }

    public IdMateria getIdMateria() {
        return idMateria;
    }

}
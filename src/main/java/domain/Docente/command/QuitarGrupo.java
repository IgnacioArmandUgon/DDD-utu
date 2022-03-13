package domain.Docente.command;

import co.com.sofka.domain.generic.Command;
import domain.Grupo.Adscripta;
import domain.Grupo.Alumno;
import domain.Grupo.HorarioGrupo;
import domain.Grupo.value.Año;
import domain.Grupo.value.IdGrupo;
import domain.Orientación.value.IdOrientacion;

import java.util.ArrayList;

public class QuitarGrupo extends Command {
    private IdGrupo idGrupo;

    public QuitarGrupo(IdGrupo idGrupo, Adscripta adscripta, HorarioGrupo horarioGrupo, ArrayList<Alumno> alumnos, Año año, IdOrientacion idOrientacion) {
        this.idGrupo = idGrupo;
    }

    public IdGrupo idGrupo() {
        return idGrupo;
    }
}
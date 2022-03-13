package domain.Docente.command;

import co.com.sofka.domain.generic.Command;
import domain.Grupo.Adscripta;
import domain.Grupo.Alumno;
import domain.Grupo.HorarioGrupo;
import domain.Grupo.value.Año;
import domain.Grupo.value.IdGrupo;
import domain.Orientación.value.IdOrientacion;

import java.util.ArrayList;

public class AñadirGrupo extends Command {
    private IdGrupo idGrupo;
    private Adscripta adscripta;
    private HorarioGrupo horarioGrupo;
    private ArrayList<Alumno> alumnos;
    private Año año;
    private IdOrientacion idOrientacion;

    public AñadirGrupo(IdGrupo idGrupo, Adscripta adscripta, HorarioGrupo horarioGrupo, ArrayList<Alumno> alumnos, Año año, IdOrientacion idOrientacion) {
        this.idGrupo = idGrupo;
        this.adscripta = adscripta;
        this.horarioGrupo = horarioGrupo;
        this.alumnos = alumnos;
        this.año = año;
        this.idOrientacion = idOrientacion;
    }

    public IdGrupo idGrupo() {
        return idGrupo;
    }

    public Adscripta adscripta() {
        return adscripta;
    }

    public HorarioGrupo horarioGrupo() {
        return horarioGrupo;
    }

    public ArrayList<Alumno> alumnos() {
        return alumnos;
    }

    public Año getAño() {
        return año;
    }

    public IdOrientacion idOrientacion() {
        return idOrientacion;
    }
}

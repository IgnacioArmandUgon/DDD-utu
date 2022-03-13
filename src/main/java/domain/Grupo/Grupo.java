package domain.Grupo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import domain.Docente.value.Edad;
import domain.Docente.value.Mail;
import domain.Docente.value.Nombre;
import domain.Grupo.value.AdscriptaCI;
import domain.Grupo.value.Año;
import domain.Grupo.value.IdGrupo;
import domain.Grupo.value.IdHorarioGrupo;
import domain.Orientación.value.IdOrientacion;

import java.util.ArrayList;

public class Grupo extends AggregateEvent<IdGrupo> {
    private Adscripta adscripta;
    private HorarioGrupo horarioGrupo;
    private ArrayList<Alumno> alumnos;
    private Año año;
    private IdOrientacion idOrientacion;

    public Grupo(IdGrupo idGrupo,Adscripta adscripta, HorarioGrupo horarioGrupo, ArrayList<Alumno> alumnos, Año año, IdOrientacion idOrientacion) {
        super(idGrupo);
        this.adscripta = adscripta;
        this.horarioGrupo = horarioGrupo;
        this.alumnos = alumnos;
        this.año = año;
        this.idOrientacion = idOrientacion;
    }
}
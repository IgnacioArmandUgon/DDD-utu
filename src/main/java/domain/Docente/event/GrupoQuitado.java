package domain.Docente.event;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import domain.Grupo.Adscripta;
import domain.Grupo.Alumno;
import domain.Grupo.HorarioGrupo;
import domain.Grupo.value.Año;
import domain.Grupo.value.IdGrupo;
import domain.Orientación.value.IdOrientacion;

import java.util.ArrayList;

public class GrupoQuitado extends DomainEvent {
    private IdGrupo idGrupo;

    public GrupoQuitado(IdGrupo idGrupo) {
        super("docente.event.grupoquitado");
        this.idGrupo = idGrupo;
    }

    public IdGrupo idGrupo() {
        return idGrupo;
    }
}
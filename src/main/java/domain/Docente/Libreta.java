package domain.Docente;


import co.com.sofka.domain.generic.Entity;
import domain.Docente.value.*;
import domain.Grupo.value.Año;
import domain.Grupo.value.IdGrupo;
import domain.Orientación.value.IdMateria;

import java.util.ArrayList;

public class Libreta extends Entity<IdLibreta> {
    private DocenteCI docenteCI;
    private IdGrupo idGrupo;
    private Año año;

    public Libreta(IdLibreta idLibreta, DocenteCI docenteCI, IdGrupo idGrupo, Año año) {
        super(idLibreta);
        this.docenteCI = docenteCI;
        this.idGrupo = idGrupo;
        this.año = año;
    }
}
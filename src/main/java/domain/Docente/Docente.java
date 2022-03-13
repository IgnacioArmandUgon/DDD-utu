package domain.Docente;

import co.com.sofka.domain.generic.Entity;
import domain.Docente.value.*;
import domain.Grupo.value.Dia;
import domain.Grupo.value.HorarioEntrada;
import domain.Grupo.value.HorarioSalida;
import domain.Orientación.value.IdMateria;

import java.util.ArrayList;

public class Docente extends Entity<DocenteCI> {
    private Nombre nombre;
    private Edad edad;
    private Mail mail;
    private ArrayList<IdMateria> materias;

    public Docente(DocenteCI docenteCI, Nombre nombre, Edad edad, Mail mail, ArrayList<IdMateria> materias) {
        super(docenteCI);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.materias = materias;
    }
}

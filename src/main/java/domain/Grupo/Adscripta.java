package domain.Grupo;

import co.com.sofka.domain.generic.Entity;
import domain.Docente.value.Edad;
import domain.Docente.value.Mail;
import domain.Docente.value.Nombre;
import domain.Grupo.value.AdscriptaCI;
import domain.Grupo.value.IdGrupo;

import java.util.ArrayList;

public class Adscripta extends Entity<AdscriptaCI> {
    private Nombre nombre;
    private AdscriptaCI adscriptaCI;
    private Edad edad;
    private Mail mail;
    private ArrayList<IdGrupo> grupos;

    public Adscripta(Nombre nombre,AdscriptaCI adscriptaCI, Edad edad, Mail mail, ArrayList<IdGrupo> grupos) {
        super(adscriptaCI);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.grupos = grupos;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Mail getMail() {
        return mail;
    }

    public ArrayList<IdGrupo> getGrupos() {
        return grupos;
    }
}
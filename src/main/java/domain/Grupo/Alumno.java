package domain.Grupo;

import co.com.sofka.domain.generic.Entity;
import domain.Docente.value.Edad;
import domain.Docente.value.Mail;
import domain.Docente.value.Nombre;
import domain.Grupo.value.AlumnoCI;
import domain.Orientación.value.IdOrientacion;

public class Alumno extends Entity<AlumnoCI> {
    private Nombre nombre;
    private Edad edad;
    private Mail mail;
    private IdOrientacion idOrientacion;

    public Alumno(AlumnoCI alumnoCI, Nombre nombre, Edad edad, Mail mail, IdOrientacion idOrientacion) {
        super(alumnoCI);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.idOrientacion = idOrientacion;
    }
}

package domain.Docente.value;

import co.com.sofka.domain.generic.Identity;

public class IdHorarioDocente extends Identity {
    private IdHorarioDocente(String valor){
        super(valor);
    }

    public IdHorarioDocente(){}
    public static IdHorarioDocente of(String valor) {
        return new IdHorarioDocente(valor);
    }
}

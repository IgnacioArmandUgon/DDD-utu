package domain.Docente.value;

import co.com.sofka.domain.generic.Identity;

public class DocenteCI extends Identity {
    private DocenteCI(String valor){
        super(valor);
    }

    public DocenteCI(){}
    public static DocenteCI of(String valor) {
        return new DocenteCI(valor);
    }
}

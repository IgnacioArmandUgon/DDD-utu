package domain.Grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class Año implements ValueObject<Año> {
    private final Año value;

    public Año(Año value) {
        this.value = value;
    }

    @Override
    public Año value(){
        return value;
    }
}

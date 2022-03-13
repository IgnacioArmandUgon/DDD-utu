package domain.Orientación.value;

import co.com.sofka.domain.generic.ValueObject;
import domain.Docente.value.Nombre;

public class Programa implements ValueObject<Programa.Props> {
    private final String metodo;
    private final String programa;
    private final String material;

    public Programa(String metodo, String programa, String material) {
        this.metodo = metodo;
        this.programa = programa;
        this.material = material;
    }

    @Override
    public Props value() {
        return new Props() {

            public String metodo() {
                return metodo;
            }

            public String programa() {
                return programa;
            }

            public String material() {
                return material;
            }
        };
    }

    public interface Props {
        String metodo();
        String programa();
        String material();
    }
}

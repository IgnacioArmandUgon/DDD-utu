package domain.Grupo.value;


import co.com.sofka.domain.generic.Identity;

public class AdscriptaCI extends Identity {
    private AdscriptaCI(String valor){
        super(valor);
    }

    public AdscriptaCI(){}
    public static AdscriptaCI of(String valor) {
        return new AdscriptaCI(valor);
    }
}

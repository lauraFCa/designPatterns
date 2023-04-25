package eventos;

public class Cinema implements IEvento {

    public String nome() {
        return "Evento Cinema";
    }

    public float acrescimo() {
        return 1.2f;
    }
}

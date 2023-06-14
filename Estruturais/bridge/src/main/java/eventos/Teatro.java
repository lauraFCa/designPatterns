package eventos;

public class Teatro implements IEvento{
    public String nome() {
        return "Evento Teatro";
    }

    public float acrescimo() {
        return 0;
    }
}

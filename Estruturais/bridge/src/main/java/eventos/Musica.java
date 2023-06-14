package eventos;

public class Musica implements IEvento{

    private String bandaArtista;

    public String nome() {
        return "Evento Musica";
    }

    public float acrescimo() {
        return 8f;
    }

    public String getBandaArtista() {
        return bandaArtista;
    }

    public void setBandaArtista(String bandaArtista) {
        this.bandaArtista = bandaArtista;
    }
}

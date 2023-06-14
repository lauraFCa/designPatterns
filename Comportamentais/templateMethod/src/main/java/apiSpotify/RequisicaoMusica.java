package apiSpotify;

public class RequisicaoMusica extends Requisicao {
    private String path;
    private String conteudo;

    public RequisicaoMusica(String path, String conteudo) {
        this.path = path;
        this.conteudo = conteudo;
    }

    public String endpoint() {
        return "spotify.musica/api/"+ this.path;
    }

    public String conteudo() {
        return this.conteudo;
    }

}

package apiSpotify;

public class RequisicaoPlaylist extends Requisicao {
    private String path;
    private String conteudo;

    public RequisicaoPlaylist(String path, String conteudo) {
        this.path = path;
        this.conteudo = conteudo;
    }

    public String endpoint() {
        return "spotify.playlists/api/" + this.path;
    }

    public String conteudo() {
        return this.conteudo;
    }
}

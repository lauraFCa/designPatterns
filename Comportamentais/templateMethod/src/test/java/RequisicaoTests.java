import apiSpotify.RequisicaoMusica;
import apiSpotify.RequisicaoPlaylist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RequisicaoTests {

    @Test
    void deveRetornarGetMusica(){
        RequisicaoMusica req = new RequisicaoMusica("nome-musica", null);
        assertEquals("Resposta do request\nGET - spotify.musica/api/nome-musica", req.RealizarGET());
    }

    @Test
    void naoDeveRetornarGetMusica(){
        RequisicaoMusica req = new RequisicaoMusica("nome-musica", null);
        assertEquals(null, req.RealizarPOST());
    }

    @Test
    void deveRetornarPostPlaylist(){
        RequisicaoPlaylist req = new RequisicaoPlaylist("new", "Nome: Playlist01; Musicas: [Musica1, Musica2]");
        assertEquals("Resposta do request\nPOST - spotify.playlists/api/new\nBody: Nome: Playlist01; Musicas: [Musica1, Musica2]", req.RealizarPOST());
    }

    @Test
    void deveRetornarGetPlaylist(){
        RequisicaoPlaylist req = new RequisicaoPlaylist("nome-playlist", "conteudo nao usado");
        assertEquals("Resposta do request\nGET - spotify.playlists/api/nome-playlist", req.RealizarGET());
    }
}

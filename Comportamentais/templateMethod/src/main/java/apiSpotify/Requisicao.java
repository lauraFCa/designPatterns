package apiSpotify;

public abstract class Requisicao {
    public abstract String endpoint();
    public abstract String conteudo();

    public String RealizarGET(){
        return "Resposta do request\nGET - " + endpoint();
    }

    public String RealizarPOST(){
        if(conteudo() != null)
            return "Resposta do request\nPOST - " + endpoint() + "\nBody: " + conteudo();

        return null;
    }

}

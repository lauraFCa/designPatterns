
/*
/* Classe representa um Portao de garagem de um predio (compartilhado)
/* O portao eh unico mas varios controles acessam e mandam abrir ou fechar
 */
public class Portao {

    //instancia privada compartilhada - static
    private static Portao uniqueInstance = new Portao();

    private boolean abrir;
    private boolean fechar;

    private Portao() {
    }

    public static Portao getInstance() {
        return uniqueInstance;
    }

    public boolean getAbrir() {
        return abrir;
    }

    public void setAbrir(boolean abrir) {
        this.abrir = abrir;
    }

    public boolean getFechar() {
        return fechar;
    }

    public void setFechar(boolean fechar) {
        this.fechar = fechar;
    }

}
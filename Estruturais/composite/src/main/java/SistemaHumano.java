import java.util.ArrayList;
import java.util.List;

public class SistemaHumano extends ParteInterna {

    public List<ParteInterna> partesInternas;

    public SistemaHumano(String nome) {
        super(nome);
        this.partesInternas = new ArrayList<>();
    }

    public void addParteInterna(ParteInterna parteInterna) {
        this.partesInternas.add(parteInterna);
    }

    public String getParteInterna() {
        String partes = "";
        partes = "Parte: " + this.getNome() + "\n";
        for (ParteInterna parteInterna : partesInternas) {
            partes += parteInterna.getParteInterna();
        }
        return partes;
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SolicitacaoExameTests {

    @Test
    void deveRetornarExcecaoCorreta(){
        try {
            SolicitacaoExame corpoHumano = new SolicitacaoExame();
            corpoHumano.getPartes();
            fail();
        } catch (NullPointerException ex){
            assertEquals("Exame sem partes internas para analisar!", ex.getMessage());
        }
    }

    @Test
    void deveRetornarSolicitacaoDeExameCorreta(){
        SistemaHumano respiratorio = new SistemaHumano("Sistema Respiratorio");
        Orgao pulmao = new Orgao("Pulmao");
        respiratorio.addParteInterna(pulmao);

        SistemaHumano digestorio = new SistemaHumano("Sistema Digestorio");
        Orgao estomago = new Orgao("Estomago");
        Orgao intestinoDelgado = new Orgao("Intestino delgado");
        digestorio.addParteInterna(estomago);
        digestorio.addParteInterna(intestinoDelgado);

        SistemaHumano sistemaNervoso = new SistemaHumano("Sistema Nervoso");

        SistemaHumano geral = new SistemaHumano("Corpo Humano");
        geral.addParteInterna(respiratorio);
        geral.addParteInterna(digestorio);
        geral.addParteInterna(sistemaNervoso);

        SolicitacaoExame corpoHumano = new SolicitacaoExame();
        corpoHumano.setPartes(geral);

        assertEquals("Parte: Corpo Humano\n" +
                "Parte: Sistema Respiratorio\n" +
                "Orgao: Pulmao\n" +
                "Parte: Sistema Digestorio\n" +
                "Orgao: Estomago\n" +
                "Orgao: Intestino delgado\n" +
                "Parte: Sistema Nervoso\n", corpoHumano.getPartes().getParteInterna());

    }
}

import abstractfactory.Filme;
import abstractfactory.factories.Factory;
import abstractfactory.factories.FactoryAnimacao;
import abstractfactory.factories.FactoryLiveAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTests {
    @Test
    public void Given_RoteiroAnimacao_When_Called_Should_ReturnCorrectly(){
        Factory fabrica = new FactoryAnimacao();
        Filme filme = new Filme(fabrica);
        assertEquals("Criar/Definir Roteiro de Animacao", filme.criarRoteiro());
    }

    @Test
    public void Given_ProducaoAnimacao_When_Called_Should_ReturnCorrectly(){
        Factory fabrica = new FactoryAnimacao();
        Filme filme = new Filme(fabrica);
        assertEquals("Criar/Definir Producao de Animacao", filme.definirProducao());
    }

    @Test
    public void Given_RoteiroLivection_When_Called_Should_ReturnCorrectly(){
        Factory fabrica = new FactoryLiveAction();
        Filme filme = new Filme(fabrica);
        assertEquals("Criar/Definir Roteiro de LiveAction", filme.criarRoteiro());
    }

    @Test
    public void Given_ProducaoLiveAction_When_Called_Should_ReturnCorrectly(){
        Factory fabrica = new FactoryLiveAction();
        Filme filme = new Filme(fabrica);
        assertEquals("Criar/Definir Producao de LiveAction", filme.definirProducao());
    }
}

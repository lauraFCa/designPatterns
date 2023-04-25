import eventos.*;
import ingressos.Meia;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MeiaTests {

    public Meia meiaEntrada;

    @BeforeEach
    public void setInitalMeia(){
        meiaEntrada = new Meia(10);
    }

    @Test
    public void DeveRetornarValorCorreto_MeiaEntrada_Cinema(){
        IEvento evento = new Cinema();
        meiaEntrada.setEvento(evento);
        assertEquals(11.2f, meiaEntrada.calcularPreco());
    }

    @Test
    public void DeveRetornarValorCorreto_MeiaEntrada_Musica(){
        IEvento evento = new Musica();
        meiaEntrada.setEvento(evento);
        assertEquals(18f, meiaEntrada.calcularPreco());
    }

    @Test
    public void DeveRetornarValorCorreto_MeiaEntrada_Teatro(){
        IEvento evento = new Teatro();
        meiaEntrada.setEvento(evento);
        assertEquals(10f, meiaEntrada.calcularPreco());
    }
}

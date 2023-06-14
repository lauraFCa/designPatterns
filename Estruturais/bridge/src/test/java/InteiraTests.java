import eventos.*;
import ingressos.Inteira;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InteiraTests {

    public Inteira entradaInteira;

    @BeforeEach
    public void setInitalInteira(){
        entradaInteira = new Inteira(20);
    }

    @Test
    public void DeveRetornarValorCorreto_EntradaInteira_Cinema(){
        IEvento evento = new Cinema();
        entradaInteira.setEvento(evento);
        assertEquals(21.2f, entradaInteira.calcularPreco());
    }

    @Test
    public void DeveRetornarValorCorreto_EntradaInteira_Musica(){
        IEvento evento = new Musica();
        entradaInteira.setEvento(evento);
        assertEquals(28f, entradaInteira.calcularPreco());
    }

    @Test
    public void DeveRetornarValorCorreto_EntradaInteira_Teatro(){
        IEvento evento = new Teatro();
        entradaInteira.setEvento(evento);
        assertEquals(20f, entradaInteira.calcularPreco());
    }
}

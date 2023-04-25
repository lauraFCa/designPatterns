import eventos.*;
import ingressos.Meia;
import ingressos.Premium;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PremiumTests {

    public Premium entradaPremium;

    @BeforeEach
    public void setInitalMeia(){
        entradaPremium = new Premium(100);
    }

    @Test
    public void DeveRetornarValorCorreto_EntradaPremium_Cinema(){
        IEvento evento = new Cinema();
        entradaPremium.setEvento(evento);
        assertEquals(101.2f, entradaPremium.calcularPreco());
    }

    @Test
    public void DeveRetornarValorCorreto_EntradaPremium_Musica(){
        IEvento evento = new Musica();
        entradaPremium.setEvento(evento);
        assertEquals(108f, entradaPremium.calcularPreco());
    }

    @Test
    public void DeveRetornarValorCorreto_EntradaPremium_Teatro(){
        IEvento evento = new Teatro();
        entradaPremium.setEvento(evento);
        assertEquals(100f, entradaPremium.calcularPreco());
    }
}

import Estados.EnviarPacote;
import Estados.ReceberPacote;
import Estados.TransportarPacote;
import objs.Acao;
import objs.Administradora;
import objs.Estado;
import objs.Pacote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministradoraTests {

    Administradora adm;
    Pacote pacote;

    @BeforeEach
    void setUp(){
        adm = new Administradora();
        pacote = new Pacote(123456);
    }

    @Test
    void deveRetornarPacoteEnviado(){
        Acao enviarPacote = new EnviarPacote(pacote);
        enviarPacote.executar();
        assertEquals(Estado.Enviado, pacote.getEstado());
    }

    @Test
    void deveRetornarPacoteCanceladoAposEnviado(){
        Acao enviarPacote = new EnviarPacote(pacote);
        enviarPacote.executar();
        enviarPacote.cancelar();
        assertEquals(Estado.Cancelado, pacote.getEstado());
    }

    @Test
    void deveRetornarPacoteRecebido(){
        Acao receberPacote = new ReceberPacote(pacote);
        receberPacote.executar();
        assertEquals(Estado.Recebido, pacote.getEstado());
    }

    @Test
    void deveRetornarPacoteDevolvidoAposRecebido(){
        Acao receberPacote = new ReceberPacote(pacote);
        receberPacote.executar();
        receberPacote.cancelar();
        assertEquals(Estado.Devolvido, pacote.getEstado());
    }

    @Test
    void deveRetornarPacoteEmTransporte(){
        Acao transportarPacote = new TransportarPacote(pacote);
        transportarPacote.executar();
        assertEquals(Estado.EmTransporte, pacote.getEstado());
    }

    @Test
    void deveRetornarPacoteCanceladoAposEmTransporte(){
        Acao transportarPacote = new TransportarPacote(pacote);
        transportarPacote.executar();
        transportarPacote.cancelar();
        assertEquals(Estado.Cancelado, pacote.getEstado());
    }


}

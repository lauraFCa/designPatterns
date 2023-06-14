import Estados.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoEnviadoTests {

    public Pedido pedido;

    @BeforeEach
    public void InicializarPedido(){
        pedido = new Pedido();
        pedido.enviar();
    }

    @Test
    void deveRetornarPedidoEnviado(){
        assertEquals("enviado", pedido.getEstado().estadoNome());
    }

    @Test
    void deveRetornarFalsoPedidoConfirmado(){
        pedido.confirmar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarFalsePedidoEnviado(){
        pedido.enviar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarTruePedidoEntregue(){
        pedido.entregar();
        assertEquals(true, pedido.getStatus());
    }

    @Test
    void deveRetornarTruePedidoCancelado(){
        pedido.cancelar();
        assertEquals(true, pedido.getStatus());
    }

}

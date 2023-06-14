import Estados.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoConfirmadoTests {

    public Pedido pedido;
    @BeforeEach
    public void InicializarPedido(){
        pedido = new Pedido();
    }

    @Test
    void deveRetornarPedidoConfirmado(){
        assertEquals("confirmado", pedido.getEstado().estadoNome());
    }

    @Test
    void deveRetornarFalsoPedidoConfirmado(){
        pedido.confirmar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarTruePedidoEnviado(){
        pedido.enviar();
        assertEquals(true, pedido.getStatus());
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

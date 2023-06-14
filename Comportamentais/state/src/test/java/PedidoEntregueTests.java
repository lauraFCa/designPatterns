import Estados.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoEntregueTests {

    public Pedido pedido;
    @BeforeEach
    public void InicializarPedido(){
        pedido = new Pedido();
        pedido.entregar();
    }

    @Test
    void deveRetornarPedidoEntregue(){
        assertEquals("entregue", pedido.getEstado().estadoNome());
    }

    @Test
    void deveRetornarFalsoPedidoEntregue(){
        pedido.entregar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarFalsePedidoEnviado(){
        pedido.enviar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarFalsePedidoConfirmado(){
        pedido.confirmar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarTruePedidoCancelado(){
        pedido.cancelar();
        assertEquals(true, pedido.getStatus());
    }

}

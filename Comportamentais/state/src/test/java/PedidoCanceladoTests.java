import Estados.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoCanceladoTests {

    public Pedido pedido;

    @BeforeEach
    public void InicializarPedido(){
        pedido = new Pedido();
        pedido.cancelar();
    }

    @Test
    void deveRetornarPedidoCancelado(){
        assertEquals("cancelado", pedido.getEstado().estadoNome());
    }

    @Test
    void deveRetornarFalsoPedidoCancelado(){
        pedido.cancelar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarFalsePedidoEnviado(){
        pedido.enviar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarFalsePedidoEntregue(){
        pedido.entregar();
        assertEquals(false, pedido.getStatus());
    }

    @Test
    void deveRetornarFalsePedidoConfirmado(){
        pedido.confirmar();
        assertEquals(false, pedido.getStatus());
    }
    
}

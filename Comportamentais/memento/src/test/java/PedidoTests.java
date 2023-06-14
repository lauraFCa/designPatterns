import Estados.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PedidoTests {

    @Test
    void deveRetornarNumeroCorretoEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarPrimeiroEstado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoCorreta() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}

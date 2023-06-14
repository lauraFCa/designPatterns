package Estados;

public class PedidoEstadoCancelado extends PedidoEstado {
    public PedidoEstadoCancelado(Pedido pedido) {
        super(pedido);
    }

    public String estadoNome(){
        return "cancelado";
    }
}
package Estados;

public class PedidoEstadoEntregue extends PedidoEstado{
    public PedidoEstadoEntregue(Pedido pedido) {
        super(pedido);
    }
    public Boolean cancelar() {
        return true;
    }

    public String estadoNome(){
        return "entregue";
    }
}

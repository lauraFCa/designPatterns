package Estados;

public class PedidoEstadoEnviado extends PedidoEstado{
    public PedidoEstadoEnviado(Pedido pedido) {
        super(pedido);
    }

    public Boolean entregar() {
        return true;
    }

    public Boolean cancelar() {
        return true;
    }

    public String estadoNome(){
        return "enviado";
    }
}

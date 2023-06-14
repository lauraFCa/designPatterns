package Estados;

public class PedidoEstadoConfirmado extends PedidoEstado{
    public PedidoEstadoConfirmado(Pedido pedido) {
        super(pedido);
    }

    public Boolean enviar() {
        return true;
    }

    public Boolean entregar() {
        return true;
    }

    public Boolean cancelar() {
        return true;
    }

    public String estadoNome(){
        return "confirmado";
    }
}

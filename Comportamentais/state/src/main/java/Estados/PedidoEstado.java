package Estados;

public abstract class PedidoEstado {
    Pedido pedido;

    public PedidoEstado(Pedido pedido){
        this.pedido = pedido;
    }

    Boolean confirmar() {
        return false;
    }

    Boolean enviar() {
        return false;
    }

    Boolean entregar() {
        return false;
    }

    Boolean cancelar() {
        return false;
    }

    public String estadoNome(){
        return "";
    }
}
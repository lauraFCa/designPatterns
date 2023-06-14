package Estados;

public class Pedido {

    private PedidoEstado pedidoEstado;
    private Boolean status;

    public Pedido(){
        this.pedidoEstado = new PedidoEstadoConfirmado(this);
    }

    public PedidoEstado getEstado(){
        return pedidoEstado;
    }

    public Boolean getStatus(){
        return this.status;
    }

    public void confirmar() {
        this.status = this.pedidoEstado.confirmar();
        this.pedidoEstado = new PedidoEstadoConfirmado(this);

    }

    public void enviar() {
        this.status = this.pedidoEstado.enviar();
        this.pedidoEstado = new PedidoEstadoEnviado(this);
        }

    public void entregar() {
        this.status = this.pedidoEstado.entregar();
        this.pedidoEstado = new PedidoEstadoEntregue(this);
    }

    public void cancelar() {
        this.status = this.pedidoEstado.cancelar();
        this.pedidoEstado = new PedidoEstadoCancelado(this);
    }

}
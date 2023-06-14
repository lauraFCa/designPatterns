package Estados;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private PedidoEstado pedidoEstado;
    private Boolean status;

    private List<PedidoEstado> memento = new ArrayList<PedidoEstado>();

    public PedidoEstado getEstado(){
        return pedidoEstado;
    }

    public void setEstado(PedidoEstado pedEstado){
        this.pedidoEstado = pedEstado;
        this.memento.add(this.pedidoEstado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.pedidoEstado = this.memento.get(indice);
    }

    public List<PedidoEstado> getEstados() {
        return this.memento;
    }



}
package Estados;

public class PedidoEstadoEntregue implements PedidoEstado{

    private PedidoEstadoEntregue() {};
    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();
    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "entregue";
    }

}

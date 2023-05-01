import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Farmacia {
    private List<Venda> vendas = new ArrayList<Venda>();

    public void vender(String dataVenda, String medicamento, float valorMedicamento){
        Remedio remedio = RemedioFactory.getRemedio(medicamento, valorMedicamento);
        Venda venda = new Venda(dataVenda, remedio);
        vendas.add(venda);
    }

    public List<String> obterVendas(){
        List<String> todasVendas = new ArrayList<String>();
        vendas.forEach(venda -> todasVendas.add(venda.obterVenda()));
        return todasVendas;
    }

}

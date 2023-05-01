import java.util.Date;

public class Venda {
    private String dataVenda;
    private Remedio remedio;

    public Venda(String dataVenda, Remedio remedio) {
        this.dataVenda = dataVenda;
        this.remedio = remedio;
    }

    public String obterVenda(){
        return "\nVenda:" + this.dataVenda +" | " + this.remedio.getMedicamento() + ", $"+ this.remedio.getValorMedicamento();
    }
}

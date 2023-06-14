package edu;

public class Venda {
    private String dataVenda;
    private Remedio remedio;

    public Venda(String dataVenda, Remedio remedio) {
        this.dataVenda = dataVenda;
        this.remedio = remedio;
    }

    public String obterVenda(){
        return "\nedu.Venda:" + this.dataVenda +" | " + this.remedio.getMedicamento() + ", $"+ this.remedio.getValorMedicamento();
    }
}

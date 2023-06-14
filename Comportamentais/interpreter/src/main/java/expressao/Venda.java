package expressao;

public class Venda {
    private double valorProduto;
    private double desconto;

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double nota1) {
        this.valorProduto = nota1;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDescontoEmPorcentagem(double desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoFinal() {
        return Loja.calcularValor(this.valorProduto, this.desconto);
    }
}
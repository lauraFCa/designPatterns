package documentos;

import gestao.Documento;
import gestao.Visitor;

public class Boleto implements Documento {

    private float valor;

    public Boleto(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String informacao(Visitor visitor) {
        return visitor.retornarBoleto(this);
    }
}

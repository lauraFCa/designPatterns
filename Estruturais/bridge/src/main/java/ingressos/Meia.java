package ingressos;

public class Meia extends Ingresso {
    private String tipo;

    public Meia(float preco){
        super(preco);
    }

    public float calcularPreco() {
        return this.preco + this.evento.acrescimo();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

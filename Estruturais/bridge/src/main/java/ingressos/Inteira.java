package ingressos;

public class Inteira extends Ingresso {

    public Inteira(float preco){
        super(preco);
    }

    public float calcularPreco() {
        return this.preco + this.evento.acrescimo();
    }
}

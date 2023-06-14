package ingressos;

import eventos.IEvento;

public abstract class Ingresso {
    protected IEvento evento;
    protected float preco;

    public Ingresso(float preco){
        this.preco = preco;
    }

    public abstract float calcularPreco();

    public void setEvento(IEvento evento) {
        this.evento = evento;
    }
}

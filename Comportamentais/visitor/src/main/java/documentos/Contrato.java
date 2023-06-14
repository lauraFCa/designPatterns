package documentos;

import gestao.Documento;
import gestao.Visitor;

public class Contrato implements Documento {

    private String nome;

    public Contrato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String informacao(Visitor visitor) {
        return visitor.retornarContrato(this);
    }
}

package documentos;

import gestao.Documento;
import gestao.Visitor;

public class Ordem implements Documento {

    private String tipoOrdemServico;

    public Ordem(String tipoOrdemServico) {
        this.tipoOrdemServico = tipoOrdemServico;
    }

    public String getTipoOrdemServico() {
        return tipoOrdemServico;
    }

    public void setTipoOrdemServico(String tipoOrdemServico) {
        this.tipoOrdemServico = tipoOrdemServico;
    }

    @Override
    public String informacao(Visitor visitor) {
        return visitor.retornarOrdem(this);
    }
}

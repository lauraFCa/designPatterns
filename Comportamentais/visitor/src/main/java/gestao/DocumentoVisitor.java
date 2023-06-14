package gestao;

import documentos.Boleto;
import documentos.Contrato;
import documentos.Ordem;

public class DocumentoVisitor implements Visitor {

    public String retornar(Documento documento){
        return documento.informacao(this);
    }

    public String retornarBoleto(Boleto boleto) {
        return "Documento Boleto\nValor: " + boleto.getValor();
    }

    public String retornarContrato(Contrato contrato) {
        return "Documento Contrato de cliente\nCliente: " + contrato.getNome();
    }

    public String retornarOrdem(Ordem ordem) {
        return "Documento Ordem de serviço\nTipo de serviço: " + ordem.getTipoOrdemServico();
    }
}

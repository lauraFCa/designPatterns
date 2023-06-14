package gestao;

import documentos.Boleto;
import documentos.Contrato;
import documentos.Ordem;

public interface Visitor {
    String retornarBoleto(Boleto boleto);
    String retornarContrato(Contrato contrato);
    String retornarOrdem(Ordem ordem);
}

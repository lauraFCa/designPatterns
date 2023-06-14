import documentos.Boleto;
import documentos.Contrato;
import documentos.Ordem;
import gestao.DocumentoVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentoVisitorTests {

    @Test
    void deveRetornarBoleto(){
        Boleto boleto = new Boleto(123f);
        DocumentoVisitor docVisit = new DocumentoVisitor();
        assertEquals("Documento Boleto\nValor: 123.0", docVisit.retornar(boleto));
    }

    @Test
    void deveRetornarContrato(){
        Contrato contrato = new Contrato("Cliente ABC");
        DocumentoVisitor docVisit = new DocumentoVisitor();
        assertEquals("Documento Contrato de cliente\nCliente: Cliente ABC", docVisit.retornar(contrato));
    }

    @Test
    void deveRetornarOrdem(){
        Ordem ordem = new Ordem("Reposicao de estoque");
        DocumentoVisitor docVisit = new DocumentoVisitor();
        assertEquals("Documento Ordem de serviço\nTipo de serviço: Reposicao de estoque", docVisit.retornar(ordem));
    }
}

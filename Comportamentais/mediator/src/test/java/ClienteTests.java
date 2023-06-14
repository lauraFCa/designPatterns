import empresa.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTests {

    @Test
    void deveRetornarSolicitacaoAjuda(){
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimentos ira redirecionar seu contato\n" +
                "Contato para Departamento Financeiro:\n"+
                "O dpt financeiro ira atender a solicitacao de ajuda - Cobrança indevida", cliente.solicitarAjuda("Cobrança indevida"));
    }

    @Test
    void deveRetornarSolicitacaoMelhoria(){
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimentos ira redirecionar seu contato\n" +
                "Contato para Departamento Financeiro:\n"+
                "O dpt financeiro ira atender a solicitacao de desconto - Cliente a mais de 3 anos", cliente.solicitarDesconto("Cliente a mais de 3 anos"));
    }
}

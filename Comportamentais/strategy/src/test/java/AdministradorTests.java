import banco.Administrador;
import banco.QueryDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdministradorTests {

    @Test
    void deveExecutarSelect(){
        Administrador administrador = new Administrador();
        QueryDto queryDto = new QueryDto();
        queryDto.dados = "Id, nome, modelo";
        queryDto.tabela = "Produtos";
        queryDto.ondeBusca = "codigo";
        queryDto.ondeResultado = "123";
        administrador.selecionarDados(queryDto);
        assertEquals("SELECT Id, nome, modelo FROM Produtos WHERE codigo = 123", administrador.getQuery());
    }

    @Test
    void deveExecutarUpdate(){
        Administrador administrador = new Administrador();
        QueryDto queryDto = new QueryDto();
        queryDto.tabela = "Vendas";
        queryDto.dados = "status";
        queryDto.novoValor = "'Nao-pago'";
        queryDto.valorAntigo = "'Pago'";
        administrador.atualizarDados(queryDto);
        assertEquals("UPDATE Vendas SET 'Nao-pago' WHERE status = 'Pago'", administrador.getQuery());
    }
}

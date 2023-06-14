package banco;

public class ExecutaUpdate implements ExecutarQuery {
    @Override
    public String executar(QueryDto dto) {
        return "UPDATE " + dto.tabela + " SET " + dto.novoValor + " WHERE " + dto.dados + " = "+ dto.valorAntigo;
    }
}

package banco;

public class ExecutaSelect implements ExecutarQuery {

    public String executar(QueryDto dto) {
        return "SELECT " + dto.dados + " FROM " + dto.tabela + " WHERE " + dto.ondeBusca + " = " + dto.ondeResultado;
    }

}

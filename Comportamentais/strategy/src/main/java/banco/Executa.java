package banco;

public class Executa {
    private QueryDto queryDto;

    public Executa(QueryDto queryDto) {
        this.queryDto = queryDto;
    }

    public String executar(ExecutarQuery executarQuery){
        return executarQuery.executar(this.queryDto);
    }

}

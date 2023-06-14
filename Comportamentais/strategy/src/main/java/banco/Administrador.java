package banco;

public class Administrador {
    private String query;

    public String getQuery(){
        return this.query;
    }

    public void selecionarDados(QueryDto queryDto){
        Executa executa = new Executa(queryDto);
        this.query = executa.executar(new ExecutaSelect());
    }

    public void atualizarDados(QueryDto queryDto){
        Executa executa = new Executa(queryDto);
        this.query = executa.executar(new ExecutaUpdate());
    }
}

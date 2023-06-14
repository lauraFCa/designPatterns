package empresa;

public class Financeiro implements Departamento {
    private static Financeiro instancia = new Financeiro();

    private Financeiro(){}

    public static Financeiro getInstance(){
        return instancia;
    }

    public String solicitacaoDesconto(String solicitacao) {
        return "O dpt financeiro ira atender a solicitacao de desconto - " + solicitacao;
    }

    public String solicitacaoAjuda(String solicitacao) {
        return "O dpt financeiro ira atender a solicitacao de ajuda - " + solicitacao;
    }
}

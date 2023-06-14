package empresa;

public class CanalAtendimento {
    private static CanalAtendimento instancia = new CanalAtendimento();

    private CanalAtendimento() {}

    public static CanalAtendimento getInstance() {
        return instancia;
    }

    public String receberSolicitacaoAjuda(String mensagem) {
        return "A Central de Atendimentos ira redirecionar seu contato\n"+
                "Contato para Departamento Financeiro:\n" +
                Financeiro.getInstance().solicitacaoAjuda(mensagem);
    }

    public String receberSolicitacaoDesconto(String mensagem) {
        return "A Central de Atendimentos ira redirecionar seu contato\n"+
                "Contato para Departamento Financeiro:\n" +
                Financeiro.getInstance().solicitacaoDesconto(mensagem);
    }


}

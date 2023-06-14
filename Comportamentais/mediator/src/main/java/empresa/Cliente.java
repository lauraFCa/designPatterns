package empresa;

public class Cliente {

    public String solicitarAjuda(String solicitacao){
        return CanalAtendimento.getInstance().receberSolicitacaoAjuda(solicitacao);
    }

    public String solicitarDesconto(String solicitacao){
        return CanalAtendimento.getInstance().receberSolicitacaoDesconto(solicitacao);
    }
}

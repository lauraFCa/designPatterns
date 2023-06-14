package objs;

import java.util.ArrayList;
import java.util.List;

public class Administradora {
    private List<Acao> acoes = new ArrayList<Acao>();

    public void executarAcao(Acao acao){
        this.acoes.add(acao);
        acao.executar();
    }

    public void cancelarUltimaAcao(){
        Integer ultimaAcaoIndex = this.acoes.size() - 1;
        if(acoes.size() != 0){
            Acao acao = this.acoes.get(ultimaAcaoIndex);
            acao.cancelar();
            this.acoes.remove(ultimaAcaoIndex);
        }
    }
}

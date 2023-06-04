package Estados;

import objs.Acao;
import objs.Pacote;

public class ReceberPacote implements Acao {
    private Pacote pacote;

    public ReceberPacote(Pacote pacote){
        this.pacote = pacote;
    }

    public void executar() {
        this.pacote.receberPacote();
    }

    public void cancelar() {
        this.pacote.devolverPacote();
    }
}

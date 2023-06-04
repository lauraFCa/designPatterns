package Estados;

import objs.Acao;
import objs.Pacote;

public class TransportarPacote implements Acao {
    private Pacote pacote;

    public TransportarPacote(Pacote pacote){
        this.pacote = pacote;
    }

    public void executar() {
        this.pacote.transportarPacote();
    }

    public void cancelar() {
        this.pacote.cancelarPacote();
    }
}

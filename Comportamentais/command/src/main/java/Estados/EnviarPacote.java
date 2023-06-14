package Estados;

import objs.Acao;
import objs.Pacote;

public class EnviarPacote implements Acao {

    private Pacote pacote;

    public EnviarPacote(Pacote pacote){
        this.pacote = pacote;
    }

    public void executar() {
        this.pacote.enviarPacote();
    }

    public void cancelar() {
        this.pacote.cancelarPacote();
    }
}

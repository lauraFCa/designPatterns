public class SolicitacaoExame {

    public ParteInterna partesParaExame;

    public ParteInterna getPartes() {
        if (this.partesParaExame == null) {
            throw new NullPointerException("Exame sem partes internas para analisar!");
        }
        return partesParaExame;
    }

    public void setPartes(ParteInterna parteInterna) {
        this.partesParaExame = parteInterna;
    }
}

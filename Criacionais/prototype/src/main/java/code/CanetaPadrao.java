package code;

public class CanetaPadrao implements Cloneable {

    private String cor;

    private float volumeTinta;

    private int grauErgonomia;

    private boolean tampa;

    private boolean click;

    private Marca marca;

    public CanetaPadrao(String cor, float volumeTinta, int grauErgonomia, boolean tampa, boolean click) {
        this.cor = cor;
        this.volumeTinta = volumeTinta;
        this.grauErgonomia = grauErgonomia;
        this.tampa = tampa;
        this.click = click;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVolumeTinta() {
        return volumeTinta;
    }

    public void setVolumeTinta(float volumeTinta) {
        this.volumeTinta = volumeTinta;
    }

    public int getGrauErgonomia() {
        return grauErgonomia;
    }

    public void setGrauErgonomia(int grauErgonomia) {
        this.grauErgonomia = grauErgonomia;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public CanetaPadrao clone() throws CloneNotSupportedException {
        CanetaPadrao cloneCaneta = (CanetaPadrao) super.clone();
        cloneCaneta.marca = (Marca) cloneCaneta.marca.clone();
        return cloneCaneta;
    }

    @Override
    public String toString() {
        return String.format(
                "Dados da caneta: cor %s | volumeTinta %s | grauErgonomia %s | tampa %s | click %s |" +
                        " marcaNome %s | marcaAno %s | marcaLote %s",
                cor, volumeTinta, grauErgonomia, tampa, click, marca.nome, marca.ano, marca.lote);
    }

}

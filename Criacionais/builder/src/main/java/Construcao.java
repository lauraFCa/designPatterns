public class Construcao {
    private Tipo tipo;
    private String clienteNome;
    private String endereco;
    private int andares;
    private int janela;
    private int entradas;
    private float preco;
    private float pesoDeCimento;
    private float altura;
    private int prazoMeses;
    private int numTrabalhadores;
    private boolean projetoEletrico;
    private boolean projetoCivil;
    private boolean projetoHidraulico;
    private boolean piscina;

    public Construcao(){
        tipo = Tipo.Casa;
        clienteNome = "";
        projetoEletrico = false;
        projetoCivil = true;
        projetoHidraulico = true;
        piscina = false;
        andares = 1;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getJanela() {
        return janela;
    }

    public void setJanela(int janela) {
        this.janela = janela;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPesoDeCimento() {
        return pesoDeCimento;
    }

    public void setPesoDeCimento(float pesoDeCimento) {
        this.pesoDeCimento = pesoDeCimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    public int getNumTrabalhadores() {
        return numTrabalhadores;
    }

    public void setNumTrabalhadores(int numTrabalhadores) {
        this.numTrabalhadores = numTrabalhadores;
    }

    public boolean getProjetoEletrico() {
        return projetoEletrico;
    }

    public void setProjetoEletrico(boolean projetoEletrico) {
        this.projetoEletrico = projetoEletrico;
    }

    public boolean getProjetoCivil() {
        return projetoCivil;
    }

    public void setProjetoCivil(boolean projetoCivil) {
        this.projetoCivil = projetoCivil;
    }

    public boolean getProjetoHidraulico() {
        return projetoHidraulico;
    }

    public void setProjetoHidraulico(boolean projetoHidraulico) {
        this.projetoHidraulico = projetoHidraulico;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

}

enum Tipo {
    Casa,
    Apartamento,
    Predio,
    Loja,
    Hotel,
    Celeiro
}
public abstract class ParteInterna {
    public String nome;

    public ParteInterna(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getParteInterna();
}

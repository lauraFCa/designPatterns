public class Orgao extends ParteInterna {

    public Orgao(String nome) {
        super(nome);
    }

    public String getParteInterna() {
        return "Orgao: " + this.getNome() + "\n";
    }
}

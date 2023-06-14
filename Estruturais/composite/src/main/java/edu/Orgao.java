package edu;

public class Orgao extends ParteInterna {

    public Orgao(String nome) {
        super(nome);
    }

    public String getParteInterna() {
        return "edu.Orgao: " + this.getNome() + "\n";
    }
}

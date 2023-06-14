package code;

public class Marca implements Cloneable {

    public String nome;

    public int ano;

    public String lote;

    public Marca(String nome, int ano, String lote){
        super();
        this.nome = nome;
        this.ano = ano;
        this.lote = lote;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

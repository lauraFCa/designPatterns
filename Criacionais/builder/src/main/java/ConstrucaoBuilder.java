/*
* Classe representando uma construcao civil qualquer - Apartamento, Casa, Loja, Hotel, Predio...
* */
public class ConstrucaoBuilder {

    private Construcao construcao;

    public ConstrucaoBuilder(){
        construcao = new Construcao();
    }

    public Construcao build(){
        if(construcao.getTipo() == null){
            throw new NullPointerException("Tipo nao pode ser nulo");
        }
        if(construcao.getAltura() <= 0){
            throw new ArithmeticException("Altura do predio nao pode ser menor ou igual a 0");
        }

        return construcao;
    }

    public ConstrucaoBuilder setTipo(Tipo tipo){
        construcao.setTipo(tipo);
        return this;
    }

    public ConstrucaoBuilder setClienteNome(String nome){
        construcao.setClienteNome(nome);
        return this;
    }

    public ConstrucaoBuilder setEndereco(String endereco){
        construcao.setEndereco(endereco);
        return this;
    }

    public ConstrucaoBuilder setAndares(int andares){
        construcao.setAndares(andares);
        return this;
    }

    public ConstrucaoBuilder setJanelas(int janelas){
        construcao.setJanela(janelas);
        return this;
    }

    public ConstrucaoBuilder setEntradas(int andares){
        construcao.setAndares(andares);
        return this;
    }

    public ConstrucaoBuilder setPreco(float preco){
        construcao.setPreco(preco);
        return this;
    }

    public ConstrucaoBuilder setPesoDeCimento(float pesoDeCimento){
        construcao.setPesoDeCimento(pesoDeCimento);
        return this;
    }

    public ConstrucaoBuilder setAltura(float altura){
        construcao.setAltura(altura);
        return this;
    }

    public ConstrucaoBuilder setPrazoMeses(int meses){
        construcao.setPrazoMeses(meses);
        return this;
    }

    public ConstrucaoBuilder setNumTrabalhadores(int num){
        construcao.setNumTrabalhadores(num);
        return this;
    }

    public ConstrucaoBuilder setProjetoEletrico(boolean projetoEletrico){
        construcao.setProjetoEletrico(projetoEletrico);
        return this;
    }

    public ConstrucaoBuilder setProjetoCivil(boolean projetoCivil){
        construcao.setProjetoCivil(projetoCivil);
        return this;
    }

    public ConstrucaoBuilder setProjetoHidraulico(boolean projetoHidraulico){
        construcao.setProjetoHidraulico(projetoHidraulico);
        return this;
    }

}

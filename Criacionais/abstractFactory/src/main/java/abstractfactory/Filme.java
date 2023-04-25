package abstractfactory;

import abstractfactory.factories.Factory;
import abstractfactory.producao.Producao;
import abstractfactory.roteiro.Roteiro;

/*
* Classe que representa um filme a ser criado
* */
public class Filme {
    private Producao producao;
    private Roteiro roteiro;

    public Filme (Factory fabrica) {
        this.producao = fabrica.defineProducao();
        this.roteiro = fabrica.createRoteiro();
    }

    public String criarRoteiro() {
        return this.roteiro.criar();
    }

    public String definirProducao() {
        return this.producao.criar();
    }
}

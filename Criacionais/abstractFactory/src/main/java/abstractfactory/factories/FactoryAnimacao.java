package abstractfactory.factories;

import abstractfactory.producao.Producao;
import abstractfactory.producao.ProducaoAnimacao;
import abstractfactory.roteiro.Roteiro;
import abstractfactory.roteiro.RoteiroAnimacao;

public class FactoryAnimacao implements Factory {

    @Override
    public Producao defineProducao(){
        return new ProducaoAnimacao();
    }

    @Override
    public Roteiro createRoteiro(){
        return new RoteiroAnimacao();
    }
}

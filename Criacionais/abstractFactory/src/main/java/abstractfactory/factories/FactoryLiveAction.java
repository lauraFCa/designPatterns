package abstractfactory.factories;

import abstractfactory.producao.Producao;
import abstractfactory.producao.ProducaoLiveAction;
import abstractfactory.roteiro.Roteiro;
import abstractfactory.roteiro.RoteiroLiveAction;

public class FactoryLiveAction implements Factory {

    @Override
    public Producao defineProducao(){
        return new ProducaoLiveAction();
    }

    @Override
    public Roteiro createRoteiro(){
        return new RoteiroLiveAction();
    }
}
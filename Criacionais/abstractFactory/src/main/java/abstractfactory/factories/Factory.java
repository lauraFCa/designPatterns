package abstractfactory.factories;

import abstractfactory.producao.Producao;
import abstractfactory.roteiro.Roteiro;

public interface Factory {
    Producao defineProducao();
    Roteiro createRoteiro();
}

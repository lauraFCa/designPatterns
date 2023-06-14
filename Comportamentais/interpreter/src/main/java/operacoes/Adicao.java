package operacoes;

import expressao.InterpretadorExpressao;
import expressao.Numero;

public class Adicao implements InterpretadorExpressao {

    private double x;
    private double y;

    public Adicao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x + y;
    }
}
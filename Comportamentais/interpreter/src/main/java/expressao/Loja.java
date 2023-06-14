package expressao;

import java.util.Formatter;

import static java.lang.Math.round;

public class Loja {

    public static String formula = "valorProduto - desconto";

    public static double calcularValor(double valorProduto, double desconto) {
        String expressao;

        Double descontoFinal = valorProduto - valorProduto*(desconto/100);


        expressao = formula.replace("valorProduto", Double.toString(valorProduto));
        expressao = expressao.replace("desconto", Double.toString(descontoFinal));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);

        String result = String.format("%.2f", interpretador.interpretar());
        return Double.parseDouble(result);
    }
}

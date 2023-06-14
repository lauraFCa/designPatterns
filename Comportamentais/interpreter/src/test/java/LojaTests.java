import expressao.Venda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTests {
    @Test
    void deveCalcularExpressaoComFormula() {
        Venda venda = new Venda();
        venda.setValorProduto(1400.50);
        venda.setDescontoEmPorcentagem(10);

        assertEquals(140.05, venda.calcularPrecoFinal());
    }
}

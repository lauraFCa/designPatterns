import code.CanetaPadrao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CanetaTests {

    public CanetaPadrao pen;
    public String firstPenOut;

    @BeforeEach
    public void SetCanetaPadraoValues(){
        pen = new CanetaPadrao("azul", 5f, 0, true, false);
        pen.setMarca(new code.Marca("Marca01", 2012, "6255AFG6"));
        firstPenOut = "Dados da caneta: cor azul | volumeTinta 5.0 | grauErgonomia 0 | tampa true | click false | marcaNome Marca01 | marcaAno 2012 | marcaLote 6255AFG6";
    }

    @Test
    public void Given_StandartCaneta_When_Created_Then_ValuesShouldBeCorrect() throws CloneNotSupportedException {
        assertEquals(firstPenOut, pen.toString());
    }

    @Test
    public void Given_NewCaneta_When_Cloned_Then_ValuesShouldBeCorrect() throws CloneNotSupportedException {
        CanetaPadrao secondPen = pen.clone();
        secondPen.setCor("vermelho");
        secondPen.setGrauErgonomia(8);
        secondPen.setClick(true);
        secondPen.getMarca().setLote("ASD46434SF");
        secondPen.getMarca().setNome("Marca02");
        String desiredOutput2 = "Dados da caneta: cor vermelho | volumeTinta 5.0 | grauErgonomia 8 | tampa true | click true | marcaNome Marca02 | marcaAno 2012 | marcaLote ASD46434SF";

        assertEquals(firstPenOut, pen.toString());
        assertEquals(desiredOutput2, secondPen.toString());
    }
}

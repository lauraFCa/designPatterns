import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConstrucaoBuilderTests {
    @Test
    public void Given_TipoDeConstrucao_When_SetToNull_Then_ExceptionShouldBeThrown(){
        try {
            ConstrucaoBuilder constBuilder = new ConstrucaoBuilder();
            Construcao construcao = constBuilder
                    .setTipo(null)
                    .build();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Tipo nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    public void Given_AlturaDaConstrucao_When_SetZero_Then_ExceptionShouldBeThrown(){
        try {
            ConstrucaoBuilder constBuilder = new ConstrucaoBuilder();
            Construcao construcao = constBuilder
                    .setAltura(0)
                    .build();
            fail();
        } catch (ArithmeticException e) {
            assertEquals("Altura do predio nao pode ser menor ou igual a 0", e.getMessage());
        }
    }

    @Test
    public void Given_AlturaDaConstrucao_When_SetLessThanZero_Then_ExceptionShouldBeThrown(){
        try {
            ConstrucaoBuilder constBuilder = new ConstrucaoBuilder();
            Construcao construcao = constBuilder
                    .setAltura(-1)
                    .build();
            fail();
        } catch (ArithmeticException e) {
            assertEquals("Altura do predio nao pode ser menor ou igual a 0", e.getMessage());
        }
    }

    @Test
    public void Given_ValidValues_When_InitalizeContrucaoBuilder_Then_ConstrucaoShoudReturnCorrectly(){
        ConstrucaoBuilder constBuilder = new ConstrucaoBuilder();
        Construcao construcao = constBuilder
                .setTipo(Tipo.Apartamento)
                .setAltura((float) 24.6)
                .setAndares(1)
                .setProjetoCivil(true)
                .build();
        assertNotNull(construcao);
    }
}

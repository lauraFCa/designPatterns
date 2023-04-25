import factory.IMotor;
import factory.MotorFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ArrumarMotorTests {

    public IMotor fixMot;

    @BeforeEach
    public void InitializeClass(){
        fixMot = MotorFactory.obterServicoMotor("Arrumar");
    }

    @Test
    public void Given_ArrumarMotor_When_GetCliente_Then_ShouldReturnCorrectValue(){
        assertEquals("Cliente da ARRUMACAO de motor", fixMot.getCliente());
    }

    @Test
    public void Given_ArrumarMotor_When_GetEndereco_Then_ShouldReturnCorrectValue(){
        assertEquals("Endereco da ARRUMACAO de motor", fixMot.getEndereco());
    }

    @Test
    public void Given_ArrumarMotor_When_GetHorario_Then_ShouldReturnCorrectValue(){
        assertEquals("Horario da ARRUMACAO de motor", fixMot.getHorario());
    }
}

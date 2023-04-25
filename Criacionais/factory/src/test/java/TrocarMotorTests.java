import factory.IMotor;
import factory.MotorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrocarMotorTests {
    public IMotor switchMot;

    @BeforeEach
    public void InitializeClass(){
        switchMot = MotorFactory.obterServicoMotor("Trocar");
    }

    @Test
    public void Given_TrocarMotor_When_GetCliente_Then_ShouldReturnCorrectValue(){
        assertEquals("Cliente da TROCA de motor", switchMot.getCliente());
    }

    @Test
    public void Given_TrocarMotor_When_GetEndereco_Then_ShouldReturnCorrectValue(){
        assertEquals("Endereco da TROCA de motor", switchMot.getEndereco());
    }

    @Test
    public void Given_TrocarMotor_When_GetHorario_Then_ShouldReturnCorrectValue(){
        assertEquals("Horario da TROCA de motor", switchMot.getHorario());
    }
}

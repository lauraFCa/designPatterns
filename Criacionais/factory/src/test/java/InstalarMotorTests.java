import factory.IMotor;
import factory.MotorFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class InstalarMotorTests {
    public IMotor installMot;

    @BeforeEach
    public void InitializeClass(){
        installMot = MotorFactory.obterServicoMotor("Instalar");
    }

    @Test
    public void Given_InstalarMotor_When_GetCliente_Then_ShouldReturnCorrectValue(){
        assertEquals("Cliente da INSTALACAO de motor", installMot.getCliente());
    }

    @Test
    public void Given_InstalarMotor_When_GetEndereco_Then_ShouldReturnCorrectValue(){
        assertEquals("Endereco da INSTALACAO de motor", installMot.getEndereco());
    }

    @Test
    public void Given_InstalarMotor_When_GetHorario_Then_ShouldReturnCorrectValue(){
        assertEquals("Horario da INSTALACAO de motor", installMot.getHorario());
    }
}

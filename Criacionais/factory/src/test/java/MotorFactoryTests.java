import factory.IMotor;
import factory.MotorFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MotorFactoryTests {

    public IMotor switchMot;

    @Test
    public void Given_MotorFactory_When_AskForInexistentClass_Then_ShouldThrowException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MotorFactory.obterServicoMotor("NaoExiste");
        });
        assertEquals("Classe nao encontrada!", exception.getMessage());
    }

    @Test
    public void Given_MotorFactory_When_AskForClassWithDifferentInstance_Then_ShouldThrowException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MotorFactory.obterServicoMotor("Excluir");
        });
        assertEquals("Nao foi possivel instanciar a classe", exception.getMessage());
    }

    @Test
    public void Given_MotorFactory_When_AskForClassNotFromInterface_Then_ShouldThrowException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MotorFactory.obterServicoMotor("Cadastrar");
        });
        assertEquals("A classe encontrada nao implementa a Interface Motor", exception.getMessage());
    }


}

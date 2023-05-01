import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PacienteTests {

    @Test
    void deveRetornarPacienteLiberado(){
        Paciente paciente = new Paciente();
        assertEquals(true, paciente.liberado());
    }

    @Test
    void deveRetornarFalsoPorEnfermaria(){
        Paciente paciente = new Paciente();
        Enfermaria.getInstancia().adicionarPacienteSemLiberaca(paciente);
        assertEquals(false, paciente.liberado());
    }

    @Test
    void deveRetornarFalsoPorMedico(){
        Paciente paciente = new Paciente();
        Medico.getInstancia().adicionarPacienteSemLiberaca(paciente);
        assertEquals(false, paciente.liberado());
    }

    @Test
    void deveRetornarFalsoPorExame(){
        Paciente paciente = new Paciente();
        Exame.getInstancia().adicionarPacienteSemLiberaca(paciente);
        assertEquals(false, paciente.liberado());
    }

    @Test
    void deveRetornarExcecaoCorreta(){
        try {
            Enfermaria.getInstancia().adicionarPacienteSemLiberaca(null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Paciente nao pode ser nulo!", e.getMessage());
        }

    }
}

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<Paciente> pacientesSemPermissaoLiberacao = new ArrayList<Paciente>();

    public void adicionarPacienteSemLiberaca(Paciente paciente){
        if(paciente == null)
            throw new NullPointerException("Paciente nao pode ser nulo!");

        this.pacientesSemPermissaoLiberacao.add(paciente);
    }

    public boolean verficarAltaPaciente(Paciente paciente){
        return this.pacientesSemPermissaoLiberacao.contains(paciente);
    }
}

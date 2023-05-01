public class PacienteFacade {
    public static boolean varificarDisponivelParaAlta(Paciente paciente) {
        if(Exame.getInstancia().verficarAltaPaciente(paciente))
            return false;
        if(Medico.getInstancia().verficarAltaPaciente(paciente))
            return false;
        if(Enfermaria.getInstancia().verficarAltaPaciente(paciente))
            return false;

        return true;
    }
}

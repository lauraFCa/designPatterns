public class Paciente {
    public boolean liberado(){
        return PacienteFacade.varificarDisponivelParaAlta(this);
    }
}

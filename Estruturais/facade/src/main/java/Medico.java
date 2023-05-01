public class Medico extends Departamento{
    private static Medico medico = new Medico();

    private Medico(){};

    public static Medico getInstancia(){
        return medico;
    }
}

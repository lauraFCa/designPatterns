public class Exame extends Departamento{

    private static Exame exame = new Exame();

    private Exame(){};

    public static Exame getInstancia(){
        return exame;
    }
}

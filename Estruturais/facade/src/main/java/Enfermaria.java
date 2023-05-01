
public class Enfermaria extends Departamento{
    private static Enfermaria enfermaria = new Enfermaria();

    private Enfermaria(){};

    public static Enfermaria getInstancia(){
        return enfermaria;
    }
}

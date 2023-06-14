package factory;

public class MotorFactory {
    public static IMotor obterServicoMotor(String servico) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("factory." + servico + "Motor");
        } catch (Exception ex) {
            throw new IllegalArgumentException("Classe nao encontrada!");
        }

        try{
            objeto = classe.newInstance();
        }catch (Exception ex){
            throw new IllegalArgumentException("Nao foi possivel instanciar a classe");
        }

        if (!(objeto instanceof IMotor)) {
            throw new IllegalArgumentException("A classe encontrada nao implementa a Interface Motor");
        }

        return (IMotor) objeto;
    }
}

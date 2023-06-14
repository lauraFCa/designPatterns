package factory;

/*
/* Classe representa a interface de servicos de um Motor
/* Cada servico tem suas funcoes mas todos precisam de informacao do cliente
 */
public interface IMotor {
    String getCliente();
    String getEndereco();
    String getHorario();
}

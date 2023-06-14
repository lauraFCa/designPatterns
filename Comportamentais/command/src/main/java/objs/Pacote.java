package objs;

public class Pacote {
    private String destino;
    private int codigo;
    private Estado estado;

    public Pacote(int codigo){
        this.codigo = codigo;
    }

    public Estado getEstado(){
        return estado;
    }

    public void enviarPacote(){
        this.estado = Estado.Enviado;
    }

    public void receberPacote(){
        this.estado = Estado.Recebido;
    }

    public void transportarPacote(){
        this.estado = Estado.EmTransporte;
    }

    public void cancelarPacote(){
        this.estado = Estado.Cancelado;
    }
    public void devolverPacote(){
        this.estado = Estado.Devolvido;
    }

}

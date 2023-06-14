package ingressos;

import java.util.Date;

public class Premium extends Ingresso{
    private Date assinanteDesde;

    public Premium(float preco){
        super(preco);
    }

    public float calcularPreco() {
        return this.preco + this.evento.acrescimo();
    }

    public Date getAssinanteDesde() {
        return assinanteDesde;
    }

    public void setAssinanteDesde(Date assinanteDesde) {
        this.assinanteDesde = assinanteDesde;
    }
}

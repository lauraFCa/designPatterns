package Planos;

public class PlanoPrePago implements PlanoCelular {
    public float price;

    public PlanoPrePago(float price){
        this.price = price;
    }

    public String getNamesStruct() {
        return "Plano Pre-pago";
    }

    public float getThePrice() {
        return this.price;
    }

}

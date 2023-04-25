package Planos;

public class PlanoControle implements PlanoCelular {
    public float price;

    public PlanoControle(float price){
        this.price = price;
    }

    public String getNamesStruct() {
        return "Plano Controle";
    }

    public float getThePrice() {
        return this.price;
    }
}
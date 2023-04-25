package Planos;

public abstract class PlanoDecorator implements PlanoCelular {
    private PlanoCelular planoCelular;
    public String namesStruct;

    public PlanoDecorator(PlanoCelular planoCelular) {
        this.planoCelular = planoCelular;
    }

    public PlanoCelular getPlanoCelular() {return planoCelular;}

    public void setPlanoCelular(PlanoCelular planoCelular) {
        this.planoCelular = planoCelular;
    }

    public abstract float getPrice();

    public float getThePrice() {
        return this.planoCelular.getThePrice() + this.getPrice();
    }

    public abstract String getNames();

    public String getNamesStruct() {
        return this.planoCelular.getNamesStruct() + " com " + this.getNames();
    }

    public void setNamesStruct(String namesStruct) {
        this.namesStruct = namesStruct;
    }
}

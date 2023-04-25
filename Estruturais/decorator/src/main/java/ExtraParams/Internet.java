package ExtraParams;

import Planos.PlanoCelular;
import Planos.PlanoDecorator;

public class Internet extends PlanoDecorator {

    public Internet(PlanoCelular plano) {
        super(plano);
    }

    public String getNames() {
        return "Internet";
    }

    public float getPrice() {
        return (float)40;
    }
}

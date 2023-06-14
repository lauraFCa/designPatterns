package ExtraParams;

import Planos.PlanoCelular;
import Planos.PlanoDecorator;

public class ChamadaInternacional extends PlanoDecorator {

    public ChamadaInternacional(PlanoCelular plano) {
        super(plano);
    }

    public String getNames() {
        return "Chamada Internacional";
    }

    public float getPrice() {
        return (float)35;
    }
}


package ExtraParams;

import Planos.PlanoCelular;
import Planos.PlanoDecorator;

public class WhatsAppIlimitado extends PlanoDecorator {

    public WhatsAppIlimitado(PlanoCelular plano) {
        super(plano);
    }

    public String getNames() {
        return "WhatsApp Ilimitado";
    }

    public float getPrice() {
        return (float)5.5;
    }
}
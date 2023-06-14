import ExtraParams.ChamadaInternacional;
import ExtraParams.Internet;
import ExtraParams.WhatsAppIlimitado;
import Planos.PlanoCelular;
import Planos.PlanoPrePago;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanoPrePagoTests {

    @Test
    public void Given_PlanoControle_When_Instanciated_Then_ShouldReturnCorrectPrice(){
        PlanoCelular plano = new PlanoPrePago((float)50);
        assertEquals(50f, plano.getThePrice());
    }

    @Test
    public void Given_PlanoControle_When_Instanciated_Then_ShouldReturnCorrectNames(){
        PlanoCelular plano = new PlanoPrePago((float)50);
        assertEquals("Plano Pre-pago", plano.getNamesStruct());
    }

    //#region single decorator
    @Test
    void Given_PlanoControle_When_AddWhatsApp_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new WhatsAppIlimitado(new PlanoPrePago(100f));
        assertEquals(105.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsApp_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new WhatsAppIlimitado(new PlanoPrePago(100f));
        assertEquals("Plano Pre-pago com WhatsApp Ilimitado", plano.getNamesStruct());
    }

    @Test
    void Given_PlanoControle_When_AddInternet_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new Internet(new PlanoPrePago(100f));
        assertEquals(140f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddInternet_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new Internet(new PlanoPrePago(100f));
        assertEquals("Plano Pre-pago com Internet", plano.getNamesStruct());
    }


    @Test
    void Given_PlanoControle_When_AddChamadaInternacional_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new ChamadaInternacional(new PlanoPrePago(100f));
        assertEquals(135f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddChamadaInternacional_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new ChamadaInternacional(new PlanoPrePago(100f));
        assertEquals("Plano Pre-pago com Chamada Internacional", plano.getNamesStruct());
    }

    //#endregion

    //#region Double decorators
    @Test
    void Given_PlanoControle_When_AddWhatsAppAndInternet_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new WhatsAppIlimitado(new Internet(new PlanoPrePago(100f)));
        assertEquals(145.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsAppAndInternet_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new WhatsAppIlimitado(new Internet(new PlanoPrePago(100f)));
        assertEquals("Plano Pre-pago com Internet com WhatsApp Ilimitado", plano.getNamesStruct());
    }

    @Test
    void Given_PlanoControle_When_AddInternetAndChamadaInternacional_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new Internet(new ChamadaInternacional(new PlanoPrePago(100f)));
        assertEquals(175f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddInternetAndChamadaInternacional_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new Internet(new ChamadaInternacional(new PlanoPrePago(100f)));
        assertEquals("Plano Pre-pago com Chamada Internacional com Internet", plano.getNamesStruct());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsAppAndChamadaInternacional_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new WhatsAppIlimitado(new ChamadaInternacional(new PlanoPrePago(100f)));
        assertEquals(140.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsAppAndChamadaInternacional_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new WhatsAppIlimitado(new ChamadaInternacional(new PlanoPrePago(100f)));
        assertEquals("Plano Pre-pago com Chamada Internacional com WhatsApp Ilimitado", plano.getNamesStruct());
    }
    //#endregions

    @Test
    void Given_PlanoControle_When_AddAllExtras_Then_ShouldReturnCorretPrice(){
        PlanoCelular plano = new ChamadaInternacional(new WhatsAppIlimitado(new Internet(new PlanoPrePago(100f))));
        assertEquals(180.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddAllExtras_Then_ShouldReturnCorretName(){
        PlanoCelular plano = new ChamadaInternacional(new WhatsAppIlimitado(new Internet(new PlanoPrePago(100f))));
        assertEquals("Plano Pre-pago com Internet com WhatsApp Ilimitado com Chamada Internacional", plano.getNamesStruct());
    }
}

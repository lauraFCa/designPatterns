import ExtraParams.ChamadaInternacional;
import ExtraParams.Internet;
import ExtraParams.WhatsAppIlimitado;
import Planos.PlanoCelular;
import Planos.PlanoControle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanoControleTests {

    @Test
    public void Given_PlanoControle_When_Instanciated_Then_ShouldReturnCorrectPrice(){
        PlanoCelular plano = new PlanoControle((float)50);
        assertEquals(50f, plano.getThePrice());
    }

    @Test
    public void Given_PlanoControle_When_Instanciated_Then_ShouldReturnCorrectNames(){
        PlanoCelular plano = new PlanoControle((float)50);
        assertEquals("Plano Controle", plano.getNamesStruct());
    }

    //#region single decorator
    @Test
    void Given_PlanoControle_When_AddWhatsApp_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new WhatsAppIlimitado(new PlanoControle(100f));
        assertEquals(105.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsApp_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new WhatsAppIlimitado(new PlanoControle(100f));
        assertEquals("Plano Controle com WhatsApp Ilimitado", plano.getNamesStruct());
    }

    @Test
    void Given_PlanoControle_When_AddInternet_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new Internet(new PlanoControle(100f));
        assertEquals(140f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddInternet_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new Internet(new PlanoControle(100f));
        assertEquals("Plano Controle com Internet", plano.getNamesStruct());
    }


    @Test
    void Given_PlanoControle_When_AddChamadaInternacional_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new ChamadaInternacional(new PlanoControle(100f));
        assertEquals(135f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddChamadaInternacional_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new ChamadaInternacional(new PlanoControle(100f));
        assertEquals("Plano Controle com Chamada Internacional", plano.getNamesStruct());
    }

    //#endregion

    //#region Double decorators
    @Test
    void Given_PlanoControle_When_AddWhatsAppAndInternet_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new WhatsAppIlimitado(new Internet(new PlanoControle(100f)));
        assertEquals(145.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsAppAndInternet_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new WhatsAppIlimitado(new Internet(new PlanoControle(100f)));
        assertEquals("Plano Controle com Internet com WhatsApp Ilimitado", plano.getNamesStruct());
    }

    @Test
    void Given_PlanoControle_When_AddInternetAndChamadaInternacional_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new Internet(new ChamadaInternacional(new PlanoControle(100f)));
        assertEquals(175f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddInternetAndChamadaInternacional_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new Internet(new ChamadaInternacional(new PlanoControle(100f)));
        assertEquals("Plano Controle com Chamada Internacional com Internet", plano.getNamesStruct());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsAppAndChamadaInternacional_Then_ShouldReturnCorrectPrice() {
        PlanoCelular plano = new WhatsAppIlimitado(new ChamadaInternacional(new PlanoControle(100f)));
        assertEquals(140.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddWhatsAppAndChamadaInternacional_Then_ShouldReturnCorrectNames() {
        PlanoCelular plano = new WhatsAppIlimitado(new ChamadaInternacional(new PlanoControle(100f)));
        assertEquals("Plano Controle com Chamada Internacional com WhatsApp Ilimitado", plano.getNamesStruct());
    }
    //#endregions

    @Test
    void Given_PlanoControle_When_AddAllExtras_Then_ShouldReturnCorretPrice(){
        PlanoCelular plano = new ChamadaInternacional(new WhatsAppIlimitado(new Internet(new PlanoControle(100f))));
        assertEquals(180.5f, plano.getThePrice());
    }

    @Test
    void Given_PlanoControle_When_AddAllExtras_Then_ShouldReturnCorretName(){
        PlanoCelular plano = new ChamadaInternacional(new WhatsAppIlimitado(new Internet(new PlanoControle(100f))));
        assertEquals("Plano Controle com Internet com WhatsApp Ilimitado com Chamada Internacional", plano.getNamesStruct());
    }
}

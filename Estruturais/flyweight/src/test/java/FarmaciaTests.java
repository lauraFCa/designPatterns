import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmaciaTests {

    @Test
    void deveRetornarRemedios(){
        Farmacia farmacia = new Farmacia();

        farmacia.vender("27/04/2022", "Analgesico", 12.7f);
        farmacia.vender("27/04/2023", "Analgesico", 12.7f);
        farmacia.vender("31/01/2022", "Anti-inflamatorio", 16.3f);

        List<String> esperado = Arrays.asList("\nVenda:27/04/2022 | Analgesico, $12.7",
                                              "\nVenda:27/04/2023 | Analgesico, $12.7",
                                              "\nVenda:31/01/2022 | Anti-inflamatorio, $16.3");

        assertEquals(esperado, farmacia.obterVendas());
    }

    @Test
    void deveRetornarTotalRemedios(){
        Farmacia farmacia = new Farmacia();

        farmacia.vender("27/04/2022", "Analgesico", 12.7f);
        farmacia.vender("27/04/2023", "Analgesico", 12.7f);
        farmacia.vender("27/04/2023", "Analgesico", 12.7f);
        farmacia.vender("31/01/2022", "Anti-inflamatorio", 16.3f);
        farmacia.vender("31/01/2022", "Anti-alergico", 26.1f);

        assertEquals(3, RemedioFactory.getTotalMedicamentos());
    }
}

import java.util.HashMap;
import java.util.Map;

public class RemedioFactory {
    private static Map<String, Remedio> remedios = new HashMap<String, Remedio>();

    public static Remedio getRemedio(String medicamento, float valorMedicamento){
        Remedio remedio = remedios.get(medicamento);
        if(remedio == null){
            remedio = new Remedio(medicamento, valorMedicamento);
            remedios.put(medicamento, remedio);
        }
        return remedio;
    }

    public static int getTotalMedicamentos(){
        return remedios.size();
    }

}

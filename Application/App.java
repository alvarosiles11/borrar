package Application;

import java.util.Date;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public class App {
    public static void main(String[] args) {
        System.out.println("Hola vamos a crear un vuelo!");
        System.out.println("");

        Date fecha_salida = new Date();
        Date fecha_arribe = new Date();
        fecha_arribe.setDate(fecha_arribe.getDate() + 1);

        Vuelo vuelo1 = new Vuelo(fecha_salida, fecha_arribe, 450.0);

        JSONObject personal001 = _test_CrearPersonal("Javier", "Flores");
        JSONObject personal002 = _test_CrearPersonal("Edson", "Mamani");
        JSONObject personal003 = _test_CrearPersonal("Liceth", "Flores");
        JSONObject personal004 = _test_CrearPersonal("Marcela", "Mandela");
        vuelo1.asignarTripulante(new Tripulante("Piloto", personal001));
        vuelo1.asignarTripulante(new Tripulante("Co-Piloto", personal002));
        vuelo1.asignarTripulante(new Tripulante("Asistente vuelo", personal003));
        vuelo1.asignarTripulante(new Tripulante("Asistente vuelo", personal004));

        JSONObject aeronave001 = _test_CrearAeronave();
        vuelo1.setAeronave(aeronave001);

        vuelo1.setAeropuertoOrigen(_test_CrearAeroPuerto("Viru-Viru"));
        vuelo1.setAeropuertoDestino(_test_CrearAeroPuerto("Guarullos"));
        System.out.println(vuelo1.toString());

    }

    public static JSONObject _test_CrearPersonal(String nombre, String apellido) {
        JSONObject personal1 = new JSONObject();
        personal1.put("key", UUID.randomUUID().toString());
        personal1.put("nombre", nombre);
        personal1.put("apellido", apellido);
        return personal1;
    }

    public static JSONObject _test_CrearAeronave() {
        JSONObject aeronave = new JSONObject();
        aeronave.put("key", UUID.randomUUID().toString());
        aeronave.put("marca", "Boeing");
        aeronave.put("modelo", "777");

        JSONArray arr = new JSONArray();
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "1"));
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "2"));
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "3"));
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "4"));
        aeronave.put("asientos", arr);
        return aeronave;
    }

    public static JSONObject _test_CrearAeroPuerto(String nombre) {
        JSONObject obj = new JSONObject();
        obj.put("key", UUID.randomUUID().toString());
        obj.put("nombre", nombre);
        return obj;
    }
}
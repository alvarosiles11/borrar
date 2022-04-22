package Domain.Event;

import java.time.LocalDateTime;
import java.util.UUID;
import org.json.JSONObject;
import ShareKernel.core.DomainEvent;

public class AsientoDisponibleAgregado extends DomainEvent {

    public UUID Key;
    public JSONObject Asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    public double Precio;
    public String Clase;

    public AsientoDisponibleAgregado(UUID key, JSONObject asiento, String clase, double precio) {
        super(LocalDateTime.now());
        Key = key;
        Precio = precio;
        Clase = clase;
        Asiento = asiento;
    }

    @Override
    public String toString() {
        return "\n[ASIENTOS_DISPONIBLES]:  Clase: " + Clase + " - Precio: " + Precio + "Bs - "
                + Asiento.toString();
    }

}
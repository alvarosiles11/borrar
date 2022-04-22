 package Domain.Model.Vuelos;

import java.time.LocalDateTime;
import java.util.UUID;
import org.json.JSONObject;
import ShareKernel.core.DomainEvent;

public class AsientoDisponible extends DomainEvent {

    public UUID Key;
    public JSONObject Asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    public double Precio;
    public String Clase;

    public AsientoDisponible(UUID key, JSONObject asiento, String clase, double precio) {
        super(LocalDateTime.now());
        Key = key;
        Precio = precio;
        Clase = clase;
        Asiento = asiento;
    }

  
}
package Domain.Event;

import java.time.LocalDateTime;
import org.json.JSONObject;
import ShareKernel.core.DomainEvent;

public class AsientoDisponibleAgregado extends DomainEvent {

    // public UUID Key;
    private JSONObject asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    private double precio;
    private String clase;

    public AsientoDisponibleAgregado(JSONObject asiento, String clase, double precio) {
        super(LocalDateTime.now());
        // Key = key;
        this.precio = precio;
        this.clase = clase;
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "\n[ASIENTOS_DISPONIBLES]:  Clase: " + this.clase + " - Precio: " + this.precio + "Bs - "
                + this.asiento.toString();
    }

}
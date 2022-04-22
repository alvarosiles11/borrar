package Domain.Model.Vuelos;

import org.json.JSONObject;

public class AsientoDisponible {
    

    private JSONObject asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    private double precio;
    private String clase;

    public AsientoDisponible(JSONObject asiento, String clase, double precio) {
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

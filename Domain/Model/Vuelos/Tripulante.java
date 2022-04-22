package Domain.Model.Vuelos;

import java.util.UUID;

import org.json.JSONObject;

public class Tripulante {
    private UUID key;
    private String descripcion; //cargo
    private JSONObject personal;

    public Tripulante(String descripcion, JSONObject personal) {
        this.key = UUID.randomUUID();
        this.descripcion = descripcion;
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "\n[TRIPULANTE]: " + this.descripcion + " - " + this.personal.toString();
    }
}
package Domain.Model.Vuelos;

import java.util.UUID;

import org.json.JSONObject;

import ShareKernel.core.Entity;

public class Tripulante extends Entity<UUID> {

    public UUID Key;

    public String Descripcion; // cargo
    public JSONObject Personal;;

    public Tripulante(String descripcion, JSONObject personal) {
        Key = UUID.randomUUID();
        Descripcion = descripcion;
        Personal = personal;
    }

    @Override
    public String toString() {
    return "\n[TRIPULANTE]: " + this.Descripcion + " - " +
    this.Personal.toString();
    }
 

}

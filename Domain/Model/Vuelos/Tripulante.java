package Domain.Model.Vuelos;

import java.util.UUID;

import com.google.gson.Gson;

import kernel.core.Entity;

public class Tripulante extends Entity<UUID> {

    public UUID Key;

    public String Descripcion; // cargo
    public Gson Personal;

    public Tripulante(String descripcion, Gson personal) {
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

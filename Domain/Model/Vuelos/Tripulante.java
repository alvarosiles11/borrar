package Domain.Model.Vuelos;

import java.time.LocalDateTime;
import java.util.UUID;

import org.json.JSONObject;

import ShareKernel.core.DomainEvent;

public class Tripulante extends DomainEvent {

    public UUID Key;

    public String Descripcion; // cargo
    public JSONObject Personal;;

    public Tripulante(String descripcion, JSONObject personal) {
        super(LocalDateTime.now());
        Key = UUID.randomUUID();
        Descripcion = descripcion;
        Personal = personal;
    }

}

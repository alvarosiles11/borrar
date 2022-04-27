package Application.UseCases.Command.Tripulantes;

import java.util.UUID;

import Application.Dto.TripulanteDto;
import kernel.mediator.Request;

public class CrearTripulanteCommand implements Request<TripulanteDto>{

    public UUID Key;
    public String Descripcion;

    public CrearTripulanteCommand(UUID key, String descripcion) {
        Key = key;
        Descripcion = descripcion;
    }

    public UUID getKey() {
        return Key;
    }

    public void setKey(UUID key) {
        Key = key;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}

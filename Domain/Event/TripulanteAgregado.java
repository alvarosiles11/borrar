package Domain.Event;

 import java.util.Date;
import java.util.UUID;

import com.google.gson.Gson;

// import ShareKernel.core.DomainEvent;
import kernel.core.*;

public class TripulanteAgregado extends DomainEvent {

    public UUID Key;

    public String Descripcion; // cargo
    public Gson Personal;;

    public TripulanteAgregado(UUID key,String descripcion, Gson personal) {
        super(new Date());
        Key = key;
        Descripcion = descripcion;
        Personal = personal;
    }

    @Override
    public String toString() {
        return "\n[TRIPULANTE]: " + this.Descripcion + " - " + this.Personal.toString();
    }

}

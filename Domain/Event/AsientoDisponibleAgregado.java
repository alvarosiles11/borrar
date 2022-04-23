package Domain.Event;

 import java.util.Date;
import java.util.UUID;

import com.google.gson.Gson;

// import ShareKernel.core.DomainEvent;
import kernel.core.*;
public class AsientoDisponibleAgregado extends DomainEvent {

    public UUID Key;
    public Gson Asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    public double Precio;
    public String Clase;

    public AsientoDisponibleAgregado(UUID key, Gson asiento, String clase, double precio) {
        super(new Date());
        Key = key;
        Precio = precio;
        Clase = clase;
        Asiento = asiento;
    }


}
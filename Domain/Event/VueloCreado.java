package Domain.Event;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
 

import ShareKernel.core.DomainEvent;

public class VueloCreado extends DomainEvent {

    public UUID Key;
    public Date Fecha_arribe; // INFO: YYYY-MM-DD HH:MM:SS
    public Date Fecha_salida;
    public double Precio;

    public VueloCreado(UUID key, Date fecha_salida, Date fecha_arribe, double precio) {
        super(LocalDateTime.now());
        Key = key;
        Fecha_salida = fecha_salida;
        Fecha_arribe = fecha_arribe;
        Precio = precio;

    }

}

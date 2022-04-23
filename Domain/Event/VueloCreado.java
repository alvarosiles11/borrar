package Domain.Event;

import java.util.Date;
import java.util.UUID;

// import ShareKernel.core.DomainEvent;
import kernel.core.*;

public class VueloCreado extends DomainEvent {

    public UUID KeyAeronave;
    public Date Fecha_arribe; // INFO: YYYY-MM-DD HH:MM:SS
    public Date Fecha_salida;

    public VueloCreado(UUID KeyAeronave, Date fecha_salida, Date fecha_arribe) {
        super(new Date());
        KeyAeronave = KeyAeronave;
        Fecha_salida = fecha_salida;
        Fecha_arribe = fecha_arribe;
    }

}

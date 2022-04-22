package Domain.Event;

import java.time.LocalDateTime;
import java.util.UUID;

import ShareKernel.core.DomainEvent;

public class VueloCreado extends DomainEvent {

    public UUID Key;
    public String CodigoSeguridad;

    public VueloCreado(UUID key, String codigoSeguridad) {
        super(LocalDateTime.now());
        Key = key;
        CodigoSeguridad = codigoSeguridad;
    }

}

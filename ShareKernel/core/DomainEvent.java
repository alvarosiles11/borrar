package ShareKernel.core;

import java.util.*;
import java.util.UUID;

public abstract class DomainEvent {

    public Date OcurredOn;
    public UUID Key;

    public DomainEvent(Date ocurredOn) {
        OcurredOn = ocurredOn;
        Key = UUID.randomUUID();
    }

    public Date getOcurredOn() {
        return OcurredOn;
    }

    public UUID getKey() {
        return Key;
    }

}

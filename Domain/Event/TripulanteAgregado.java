package Domain.Event;

import java.time.LocalDateTime;

import SharedKernel.core.DomainEvent;

public class TripulanteAgregado extends DomainEvent {

    public String keyTripulante; // tripulante
    public String cargo; // cargo
    public TripulanteAgregado(String keyTripulante, String cargo) {
        super(LocalDateTime.now());
        this.keyTripulante = keyTripulante;
        this.cargo = cargo;
     }
}

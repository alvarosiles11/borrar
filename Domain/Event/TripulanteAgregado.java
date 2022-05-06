package Domain.Event;

import java.time.LocalDateTime;

import SharedKernel.core.DomainEvent;

public class TripulanteAgregado extends DomainEvent {

    public String nrovuelo;
    public String descripcion; // cargo
    public String nombre; // nombre completo

    public TripulanteAgregado(String nrovuelo, String descripcion, String nombre) {
        super(LocalDateTime.now());
        this.nrovuelo = nrovuelo;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    // TODO implementar getters y setters

}

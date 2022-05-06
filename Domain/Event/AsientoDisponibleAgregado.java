package Domain.Event;

import java.time.LocalDateTime;

import SharedKernel.core.DomainEvent;

public class AsientoDisponibleAgregado extends DomainEvent {

    public String nroVuelo;
    public String matricula;
    public String clase;
    public double precio;
    public String estado;

    public AsientoDisponibleAgregado(String nroVuelo, String matricula, String clase, double precio, String estado) {
        super(LocalDateTime.now());
        this.nroVuelo = nroVuelo;
        this.matricula = matricula;
        this.clase = clase;
        this.precio = precio;
        this.estado = estado;
    }
    // TODO implementar getters y setters

}
package Domain.Event;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

// import ShareKernel.core.DomainEvent;
import SharedKernel.core.DomainEvent;

public class VueloCreado extends DomainEvent {

    public UUID KeyAeronave;
    public Date Fecha_arribe; // INFO: YYYY-MM-DD HH:MM:SS
    public Date Fecha_salida;

    // TODO quizas necesite este constructor con estos atributos
    // public String nroVuelo;
    // public List<Tripulante> listaTripulante;
    // public List<AsientoDisponible> listaAsientoDisponible;

    public VueloCreado(UUID keyAeronave, Date fecha_salida, Date fecha_arribe) {
        super(LocalDateTime.now());
        KeyAeronave = keyAeronave;
        Fecha_salida = fecha_salida;
        Fecha_arribe = fecha_arribe;
    }

    // TODO implementar getters y setters

}

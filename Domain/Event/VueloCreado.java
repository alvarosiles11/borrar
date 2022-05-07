package Domain.Event;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import Domain.Model.Vuelos.Tripulante;
import SharedKernel.core.DomainEvent;

public class VueloCreado extends DomainEvent {

    public UUID keyVuelo;
    public String nroVuelo;
    public String keyAeronave;
    public String keyAeropuertoOrigen;
    public String keyAeropuertoDestino;
    public Date fecha_salida;
    public Date fecha_arribe;
    public List<Tripulante> listaTripulante;

    public VueloCreado(UUID _keyVuelo,String _nroVuelo, String _keyAeronave,
            String _keyAeropuertoOrigen, String _keyAeropuertoDestino,
            Date _fecha_salida, Date _fecha_arribe,
            List<Tripulante> _listaTripulante) {
        super(LocalDateTime.now());
        keyVuelo = _keyVuelo;
        nroVuelo = _nroVuelo;
        keyAeronave = _keyAeronave;
        keyAeropuertoOrigen = _keyAeropuertoOrigen;
        keyAeropuertoDestino = _keyAeropuertoDestino;
        fecha_salida = _fecha_salida;
        fecha_arribe = _fecha_arribe;
        listaTripulante = _listaTripulante;
    }
}
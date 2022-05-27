package dmsnur.Domain.Event;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.SharedKernel.core.DomainEvent;

public class VueloCreado extends DomainEvent {

    public UUID keyVuelo;
    public String nroVuelo;
    public String keyAeronave;
    public String keyAeropuertoOrigen;
    public String keyAeropuertoDestino;
    public Date fecha_salida;
    public Date fecha_arribe;
    public List<Tripulante> listaTripulante;

    public VueloCreado() {
        super();
    }

    public VueloCreado(UUID _keyVuelo, String _nroVuelo, String _keyAeronave,
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

    public UUID getKeyVuelo() {
        return keyVuelo;
    }

    public void setKeyVuelo(UUID keyVuelo) {
        this.keyVuelo = keyVuelo;
    }

    public String getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(String nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public String getKeyAeronave() {
        return keyAeronave;
    }

    public void setKeyAeronave(String keyAeronave) {
        this.keyAeronave = keyAeronave;
    }

    public String getKeyAeropuertoOrigen() {
        return keyAeropuertoOrigen;
    }

    public void setKeyAeropuertoOrigen(String keyAeropuertoOrigen) {
        this.keyAeropuertoOrigen = keyAeropuertoOrigen;
    }

    public String getKeyAeropuertoDestino() {
        return keyAeropuertoDestino;
    }

    public void setKeyAeropuertoDestino(String keyAeropuertoDestino) {
        this.keyAeropuertoDestino = keyAeropuertoDestino;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_arribe() {
        return fecha_arribe;
    }

    public void setFecha_arribe(Date fecha_arribe) {
        this.fecha_arribe = fecha_arribe;
    }

    public List<Tripulante> getListaTripulante() {
        return listaTripulante;
    }

    public void setListaTripulante(List<Tripulante> listaTripulante) {
        this.listaTripulante = listaTripulante;
    }
}
package Domain.Factories;

import java.util.Date;
import java.util.List;

import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public interface IVueloFactory {
    public Vuelo Create(String _nroVuelo, String _keyAeronave,String _keyAeropuertoOrigen, String _keyAeropuertoDestino,Date _fecha_salida, Date _fecha_arribe,List<Tripulante> _listaTripulante);
}
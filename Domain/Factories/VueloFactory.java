package Domain.Factories;

import java.util.Date;
import java.util.List;

import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public class VueloFactory implements IVueloFactory {

    @Override
    public Vuelo Create(String nroVuelo, String keyAeronave, String keyAeropuertoOrigen,
            String keyAeropuertoDestino, Date fecha_salida, Date fecha_arribe, List<Tripulante> listaTripulante) {
        return new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
                fecha_arribe, listaTripulante);
    }

}
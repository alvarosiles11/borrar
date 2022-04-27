package Domain.Factories;

import java.util.List;
import java.util.UUID;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public class VueloFactory implements IVueloFactory {

    public VueloFactory() {
    }
    
    @Override
    public Vuelo Create(UUID nroVuelo, List<Tripulante> listaTripulante, List<AsientoDisponible> listaAsientoDisponible) {
        return new Vuelo(nroVuelo, listaTripulante, listaAsientoDisponible);
    }

}
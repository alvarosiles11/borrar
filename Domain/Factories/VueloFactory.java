package Domain.Factories;

import java.util.List;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public class VueloFactory implements IVueloFactory {

    public VueloFactory() {
    }
    
    @Override
    public Vuelo Create(String nroVuelo, List<Tripulante> listaTripulante, List<AsientoDisponible> listaAsientoDisponible) {
        return new Vuelo(nroVuelo, listaTripulante, listaAsientoDisponible);
    }

}
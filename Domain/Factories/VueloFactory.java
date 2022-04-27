package Domain.Factories;

import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;

public class VueloFactory implements IVueloFactory {

    @Override
    public Vuelo Create(UUID nroVuelo) {
        return new Vuelo(nroVuelo);
    }
}
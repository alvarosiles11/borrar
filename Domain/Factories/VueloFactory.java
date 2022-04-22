package Domain.Factories;

import Domain.Model.Vuelos.Vuelo;

public class VueloFactory implements IVueloFactory {

    @Override
    public Vuelo Create(String nroVuelo) {
        return new Vuelo(nroVuelo);
    }
    
}

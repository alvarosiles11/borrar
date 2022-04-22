package Domain.Factories;

import Domain.Model.Vuelos.Vuelo;

public interface IVueloFactory {
    Vuelo Create (String nroVuelo);
}

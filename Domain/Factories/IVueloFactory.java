package Domain.Factories;

import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;

public interface IVueloFactory {
    Vuelo Create(UUID nroVuelo);
}
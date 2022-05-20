package Domain.Factories;

import java.util.UUID;

import Domain.Model.Vuelos.Tripulante;

public interface ITripulanteFactory {
    public Tripulante Create(UUID _keyVuelo, String _keyTripulante, String _cargo);
}
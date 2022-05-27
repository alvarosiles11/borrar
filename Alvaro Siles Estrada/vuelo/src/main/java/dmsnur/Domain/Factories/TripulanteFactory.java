package dmsnur.Domain.Factories;

import java.util.UUID;

import dmsnur.Domain.Model.Vuelos.Tripulante;

public class TripulanteFactory implements ITripulanteFactory {

    public TripulanteFactory() {
    }

    @Override
    public Tripulante Create(UUID _keyVuelo, String _keyTripulante, String _cargo) {
        return new Tripulante(_keyVuelo, _keyTripulante, _cargo);
    }
}
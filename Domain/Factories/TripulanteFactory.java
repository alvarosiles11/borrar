package Domain.Factories;

import Domain.Model.Vuelos.Tripulante;

public class TripulanteFactory implements ITripulanteFactory {

    public TripulanteFactory() {
    }

    @Override
    public Tripulante Create(String _keyTripulante, String _cargo) {
        return new Tripulante(_keyTripulante,_cargo);
    }
}
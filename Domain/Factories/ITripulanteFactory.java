package Domain.Factories;

import Domain.Model.Vuelos.Tripulante;

public interface ITripulanteFactory {
    public Tripulante Create(String _keyTripulante, String _cargo);

}

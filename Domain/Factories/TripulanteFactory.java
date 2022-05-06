package Domain.Factories;

import Domain.Model.Vuelos.Tripulante;

public class TripulanteFactory implements ITripulanteFactory {

    public TripulanteFactory() {
    }

    @Override
    public Tripulante Create(String nrovuelo, String descripcion, String nombre) {
        return new Tripulante(nrovuelo,descripcion,nombre);
    }
}
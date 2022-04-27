package Domain.Factories;

import java.util.UUID;

import Domain.Model.Vuelos.AsientoDisponible;

public class AsientoDisponibleFactory implements IAsientoDisponibleFactory {

    public AsientoDisponibleFactory() {
    }

    @Override
    public AsientoDisponible Create(UUID nrovuelo, String clase, double precio, String estado) {
        return new AsientoDisponible(nrovuelo, clase, precio, estado);
    }

}
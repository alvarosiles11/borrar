package Domain.Factories;

import Domain.Model.Vuelos.AsientoDisponible;

public class AsientoDisponibleFactory implements IAsientoDisponibleFactory {

    public AsientoDisponibleFactory() {
    }

    @Override
    public AsientoDisponible Create(String nroVuelo, String matricula, String clase, double precio, String estado) {
        return new AsientoDisponible(nroVuelo, matricula, clase, precio, estado);
    }

}
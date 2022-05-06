package Domain.Factories;

import Domain.Model.Vuelos.AsientoDisponible;

public interface IAsientoDisponibleFactory {
    public AsientoDisponible Create(String nroVuelo, String matricula, String clase, double precio, String estado);

}
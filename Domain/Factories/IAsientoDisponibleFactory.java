package Domain.Factories;
import java.util.UUID;

import Domain.Model.Vuelos.AsientoDisponible;

public interface IAsientoDisponibleFactory {
    public AsientoDisponible Create(UUID nrovuelo, String clase, double precio, String estado);

}
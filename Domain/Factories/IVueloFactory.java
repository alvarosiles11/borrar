package Domain.Factories;

import java.util.List;
import java.util.UUID;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public interface IVueloFactory {
    public Vuelo Create(UUID nroVuelo, List<Tripulante> listatripulantes, List<AsientoDisponible> listaAsiento);
}
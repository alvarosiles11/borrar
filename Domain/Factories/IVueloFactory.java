package Domain.Factories;

import java.util.List;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public interface IVueloFactory {
    public Vuelo Create(String nroVuelo, List<Tripulante> listatripulantes, List<AsientoDisponible> listaAsiento);
}
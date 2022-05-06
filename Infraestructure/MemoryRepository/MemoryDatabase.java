package Infraestructure.MemoryRepository;

import java.util.ArrayList;
import java.util.List;

import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public class MemoryDatabase {

    private List<Vuelo> _vuelos;
    private List<Tripulante> _tripulante;

    public List<Vuelo> get_vuelos() {
        return _vuelos;
    }

    public List<Tripulante> get_tripulantes() {
        return _tripulante;
    }

    public MemoryDatabase() {
        _vuelos = new ArrayList<>();
        _tripulante = new ArrayList<>();
    }
}

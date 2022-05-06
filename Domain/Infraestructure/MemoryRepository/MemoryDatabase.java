package Domain.Infraestructure.MemoryRepository;

import java.util.ArrayList;
import java.util.List;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public class MemoryDatabase {

    private List<Vuelo> _vuelo;
    private List<AsientoDisponible> _asientoDisponibles;
    private List<Tripulante> _tripulantes;

    public MemoryDatabase() {
        _vuelo = new ArrayList<>();
        _asientoDisponibles = new ArrayList<>();
        _tripulantes = new ArrayList<>();
    }

    public List<Vuelo> get_vuelo() {
        return _vuelo;
    }

    public void set_vuelo(List<Vuelo> _vuelo) {
        this._vuelo = _vuelo;
    }

    public List<AsientoDisponible> get_asientoDisponibles() {
        return _asientoDisponibles;
    }

    public void set_asientoDisponibles(List<AsientoDisponible> _asientoDisponibles) {
        this._asientoDisponibles = _asientoDisponibles;
    }

    public List<Tripulante> get_tripulantes() {
        return _tripulantes;
    }

    public void set_tripulantes(List<Tripulante> _tripulantes) {
        this._tripulantes = _tripulantes;
    }


    
}

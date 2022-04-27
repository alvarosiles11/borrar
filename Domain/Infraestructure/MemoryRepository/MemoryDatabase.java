package Domain.Infraestructure.MemoryRepository;

import java.util.List;

import Domain.Model.Vuelos.Tripulante;

public class MemoryDatabase {

    private List<Tripulante> _tripulantes;

    public MemoryDatabase() {
    }

    public List<Tripulante> get_tripulantes() {
        return _tripulantes;
    }

    public void set_tripulantes(List<Tripulante> _tripulantes) {
        this._tripulantes = _tripulantes;
    }

}

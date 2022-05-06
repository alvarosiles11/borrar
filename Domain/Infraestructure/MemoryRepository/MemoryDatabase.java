package Domain.Infraestructure.MemoryRepository;

import java.util.ArrayList;
import java.util.List;

import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;

public class MemoryDatabase {

    private List<Vuelo> _vuelo;
     private List<Tripulante> _tripulantes;

    public MemoryDatabase() {
        _vuelo = new ArrayList<>();
        _tripulantes = new ArrayList<>();
    }

    public List<Vuelo> get_vuelo() {
        return _vuelo;
    }

    public void set_vuelo(List<Vuelo> _vuelo) {
        this._vuelo = _vuelo;
    }



    public List<Tripulante> get_tripulantes() {
        return _tripulantes;
    }

    public void set_tripulantes(List<Tripulante> _tripulantes) {
        this._tripulantes = _tripulantes;
    }


    
}

package Infraestructure.MemoryRepository;

import java.util.ArrayList;
import java.util.List;

import Domain.Model.Vuelos.Vuelo;

public class MemoryDatabase {
   
  
    
    private List<Vuelo> _vuelos;

    public List<Vuelo> get_vuelos() {
        return _vuelos;
    }

    public MemoryDatabase() {
        _vuelos = new ArrayList<>();
    }
}

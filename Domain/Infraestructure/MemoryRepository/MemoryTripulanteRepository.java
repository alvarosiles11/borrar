package Domain.Infraestructure.MemoryRepository;

import java.util.UUID;

import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;

public class MemoryTripulanteRepository implements ITripulanteRepository {

    private MemoryDatabase _database;

    public MemoryTripulanteRepository(MemoryDatabase database) {
        _database = database;
    }

    @Override
    public Tripulante FindByKey(UUID key) {
        return _database.get_tripulantes().stream().filter(x -> x.getKey().equals(key)).findFirst().orElse(null);
    }
    
    @Override
    public void Create(Tripulante arg0) {
        _database.get_tripulantes().add(arg0);
    }


}

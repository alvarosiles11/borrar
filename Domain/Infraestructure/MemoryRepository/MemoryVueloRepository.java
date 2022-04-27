package Domain.Infraestructure.MemoryRepository;

import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IVueloRepository;

public class MemoryVueloRepository implements IVueloRepository {
    
    private MemoryDatabase _database;

    public MemoryVueloRepository(MemoryDatabase database) {
        _database = database;
    }

    @Override
    public void Create(Vuelo arg0) {
        _database.get_vuelo().add(arg0);
    }

    @Override
    public Vuelo FindByKey(UUID key) {
        return _database.get_vuelo().stream().filter(x -> x.getKey().equals(key)).findFirst().orElse(null);
    }
}

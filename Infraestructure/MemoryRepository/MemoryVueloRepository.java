package Infraestructure.MemoryRepository;

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
      _database.get_vuelos().add(arg0);
    }

    @Override
    public Vuelo FindByKey(UUID arg0) {
        return _database.get_vuelos().stream().filter(x -> x.getKey().equals(arg0)).findFirst().orElse(null);
    }

}

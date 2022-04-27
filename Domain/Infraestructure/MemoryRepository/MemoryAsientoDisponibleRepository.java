package Domain.Infraestructure.MemoryRepository;

import java.util.UUID;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Repositories.IAsientoDisponibleRepository;

public class MemoryAsientoDisponibleRepository implements IAsientoDisponibleRepository {

    private MemoryDatabase _database;

    public MemoryAsientoDisponibleRepository(MemoryDatabase database) {
        _database = database;
    }

    @Override
    public void Create(AsientoDisponible arg0) {
        _database.get_asientoDisponibles().add(arg0);
    }

    @Override
    public AsientoDisponible FindByKey(UUID key) {
        return _database.get_asientoDisponibles().stream().filter(x -> x.getKey().equals(key)).findFirst().orElse(null);
    }

}

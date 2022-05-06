package Infraestructure.MemoryRepository;

import java.util.UUID;

import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;

public class MemoryTripulanteRepository implements ITripulanteRepository {

    private MemoryDatabase _database;

    public MemoryTripulanteRepository(MemoryDatabase database) {
        _database = database;
    }

    @Override
    public void Create(Tripulante arg0) {
        _database.get_tripulantes().add(arg0);
    }

    @Override
    public Tripulante FindByKey(UUID arg0) {
        return _database.get_tripulantes().stream().filter(x -> x.getKey().equals(arg0)).findFirst().orElse(null);
    }
}
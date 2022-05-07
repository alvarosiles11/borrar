package Infraestructure.PostgreRepository.Repository;

import java.util.UUID;

import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import Infraestructure.PostgreRepository.Context.WriteDbContext;
import SharedKernel.db.DbSet;

public class TripulanteRepository implements ITripulanteRepository {

    private DbSet<Tripulante> _tripulante;

    public TripulanteRepository(WriteDbContext database) {
        _tripulante = database.Tripulante;
    }

    @Override
    public void Create(Tripulante arg0) {
        _tripulante.AddAsync(arg0);
    }

    @Override
    public Tripulante FindByKey(UUID arg0) {
        return null;
    }
}
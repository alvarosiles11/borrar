package Infraestructure.Repository;

import java.util.UUID;

import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import Infraestructure.Context.IWriteDbContext;
import SharedKernel.db.DbSet;

public class TripulanteRepository implements ITripulanteRepository {

    private DbSet<Tripulante> _tripulante;

    public TripulanteRepository(IWriteDbContext database) {
        _tripulante = database.Tripulante;
    }

    @Override
    public void Create(Tripulante arg0) {
         _tripulante.Add(arg0);

    }

    @Override
    public Tripulante FindByKey(UUID arg0) {
        return null;
    }
}
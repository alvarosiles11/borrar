package Infraestructure.Repository;

import java.util.List;
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
    public List<Tripulante> GetAll() {
        return _tripulante.All();
    }

    @Override
    public Tripulante FindByKey(UUID key) {
        return _tripulante.Single(obj -> obj.key.equals(key));
    }

    @Override
    public void Create(Tripulante objTripulante) {
        _tripulante.Add(objTripulante);

    }

    @Override
    public Tripulante Update(Tripulante objTripulante) {
        _tripulante.Update(objTripulante, (it -> it.key.equals(objTripulante.key)));
        return objTripulante;
    }

    @Override
    public Tripulante Delete(Tripulante objTripulante) {
        _tripulante.Delete((it -> it.key.equals(objTripulante.key)));
        return objTripulante;
    }
}
package Infraestructure.Repository;

import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IVueloRepository;
import Infraestructure.Context.IWriteDbContext;
import SharedKernel.db.DbSet;

public class VueloRepository implements IVueloRepository {

    private DbSet<Vuelo> _vuelos;

    public VueloRepository(IWriteDbContext database) {
        _vuelos = database.Vuelo;
    }

    @Override
    public void Create(Vuelo arg0) {
         _vuelos.Add(arg0);

    }

    @Override
    public Vuelo FindByKey(UUID arg0) {
          return _vuelos.Single(obj -> obj.key.toString().equals(arg0.toString()));

    }
}
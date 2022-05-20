package Infraestructure.Repository;

import java.util.List;
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
    public List<Vuelo> GetAll() {
        return _vuelos.All();
    }

    @Override
    public Vuelo FindByKey(UUID key) {
        return _vuelos.Single(obj -> obj.key.equals(key));
    }

    @Override
    public void Create(Vuelo objVuelo) {
        _vuelos.Add(objVuelo);
    }

    @Override
    public Vuelo Update(Vuelo objVuelo) {
        _vuelos.Update(objVuelo, (it -> it.key.equals(objVuelo.key)));
        return objVuelo;
    }

    @Override
    public Vuelo Delete(Vuelo objVuelo) {
        _vuelos.Delete((it -> it.key.equals(objVuelo.key)));
        return objVuelo;
    }
}
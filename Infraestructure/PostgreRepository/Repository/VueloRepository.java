package Infraestructure.PostgreRepository.Repository;

import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IVueloRepository;
import Infraestructure.PostgreRepository.Context.WriteDbContext;
import SharedKernel.db.DbSet;

public class VueloRepository implements IVueloRepository {

    private DbSet<Vuelo> _vuelos;

    public VueloRepository(WriteDbContext database) {
        _vuelos = database.Vuelo;
    }

    @Override
    public void Create(Vuelo arg0) {
        _vuelos.AddAsync(arg0);

    }

    @Override
    public Vuelo FindByKey(UUID arg0) {
        // TODO Auto-generated method stub
        return null;
    }
}
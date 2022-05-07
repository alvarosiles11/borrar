package Infraestructure.PostgreRepository.Context;

import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;
import SharedKernel.db.DbContext;
import SharedKernel.db.DbSet;

public class WriteDbContext extends DbContext {

    public DbSet<Vuelo> Vuelo;
    public DbSet<Tripulante> Tripulante;

    public WriteDbContext() {
        super(WriteDbContext.class);
    }

    // RICKY
    // @Override
    // public void onModelCreating() {

    // }

    @Override
    public void SaveChangesAsync() {
        System.out.println("SaveChangesAsync called ot implement");
    }

}

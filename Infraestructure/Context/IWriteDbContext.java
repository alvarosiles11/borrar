package Infraestructure.Context;
import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;
import SharedKernel.db.DbContext;
import SharedKernel.db.DbSet;
public abstract class IWriteDbContext extends DbContext {

    public IWriteDbContext(Class dbContextClass) {
        super(dbContextClass);
    }

    public DbSet<Vuelo> Vuelo;
    public DbSet<Tripulante> Tripulante;
}

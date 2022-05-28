package dmsnur.Infraestructure.Context;

import dmsnur.Domain.Model.Aeronaves.Aeronave;
import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.Domain.Model.Vuelos.Vuelo;
import dmsnur.SharedKernel.db.DbContext;
import dmsnur.SharedKernel.db.DbSet;

public abstract class IWriteDbContext extends DbContext {

    public IWriteDbContext(Class dbContextClass) {
        super(dbContextClass);
    }

    public DbSet<Vuelo> Vuelo;
    public DbSet<Tripulante> Tripulante;
    public DbSet<Aeronave> Aeronave;
}

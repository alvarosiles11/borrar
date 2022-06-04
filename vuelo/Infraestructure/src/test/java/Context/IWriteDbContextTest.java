package Context;

import org.junit.Test;
import org.mockito.Mockito;

public class IWriteDbContextTest {

    @Test
    public void CheckConstructor() {
        IWriteDbContext context = Mockito.mock(IWriteDbContext.class);
        // IWriteDbContext saDbContext = new IWriteDbContext();
    }

    // public IWriteDbContext(Class dbContextClass) {
    // super(dbContextClass);
    // }

    // public DbSet<Vuelo> Vuelo;
    // public DbSet<Tripulante> Tripulante;
    // public DbSet<Aeronave> Aeronave;
}

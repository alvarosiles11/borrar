package dmsnur.Infraestructure;

import dmsnur.Domain.Repositories.IAeronaveRepository;
import dmsnur.Domain.Repositories.ITripulanteRepository;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.Domain.Repositories.IVueloRepository;
import dmsnur.Infraestructure.Context.IWriteDbContext;
import dmsnur.Infraestructure.Context.MongoDB.WriteDbContext;
import dmsnur.Infraestructure.Repository.AeronaveRepository;
import dmsnur.Infraestructure.Repository.TripulanteRepository;
import dmsnur.Infraestructure.Repository.VueloRepository;
import dmsnur.SharedKernel.extensions.IServiceCollection;

public class Extensions {
    public static void AddInfraestructure() {
        dmsnur.Application.Extensions.AddApplication();
        IServiceCollection.AddMediator();

        IServiceCollection.AddScoped(IWriteDbContext.class, WriteDbContext.class);
        IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
        IServiceCollection.AddScoped(IVueloRepository.class, VueloRepository.class);
        IServiceCollection.AddScoped(ITripulanteRepository.class, TripulanteRepository.class);
        IServiceCollection.AddScoped(IAeronaveRepository.class, AeronaveRepository.class);
    }
}
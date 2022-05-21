package Infraestructure;

import Domain.Repositories.IAeronaveRepository;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;
import Domain.Repositories.IVueloRepository;
import Infraestructure.Context.IWriteDbContext;
import Infraestructure.Context.MongoDB.WriteDbContext;
import Infraestructure.Repository.AeronaveRepository;
import Infraestructure.Repository.TripulanteRepository;
import Infraestructure.Repository.VueloRepository;
import SharedKernel.extensions.IServiceCollection;

public class Extensions {
    public static void AddInfraestructure() {
        Application.Extensions.AddApplication();
        IServiceCollection.AddMediator();

        IServiceCollection.AddScoped(IWriteDbContext.class, WriteDbContext.class);
        IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
        IServiceCollection.AddScoped(IVueloRepository.class, VueloRepository.class);
        IServiceCollection.AddScoped(ITripulanteRepository.class, TripulanteRepository.class);
        IServiceCollection.AddScoped(IAeronaveRepository.class, AeronaveRepository.class);
    }
}
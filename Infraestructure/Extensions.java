package Infraestructure;

import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;
import Domain.Repositories.IVueloRepository;
import Infraestructure.EF.UnitOfWork;
import Infraestructure.PostgreRepository.Context.WriteDbContext;
import Infraestructure.PostgreRepository.Repository.TripulanteRepository;
import Infraestructure.PostgreRepository.Repository.VueloRepository;
import SharedKernel.extensions.IServiceCollection;

public class Extensions {
    public static void AddInfraestructure() {
        Application.Extensions.AddApplication();
        IServiceCollection.AddMediator();
        IServiceCollection.AddScoped(WriteDbContext.class, WriteDbContext.class);
        IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
        IServiceCollection.AddScoped(IVueloRepository.class, VueloRepository.class);
        IServiceCollection.AddScoped(ITripulanteRepository.class, TripulanteRepository.class);
    }
}
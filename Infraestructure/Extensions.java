package Infraestructure;

import Domain.Repositories.IUnitOfWork;
import Domain.Repositories.IVueloRepository;
import Infraestructure.EF.UnitOfWork;
import Infraestructure.MemoryRepository.MemoryDatabase;
import Infraestructure.MemoryRepository.MemoryVueloRepository;
import SharedKernel.extensions.IServiceCollection;

public class Extensions {
         public static void AddInfraestructure() {
            Application.Extensions.AddApplication();
            IServiceCollection.AddSingleton(MemoryDatabase.class);
            IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
            // IServiceCollection.AddScoped(ITripulanteRepository.class, MemoryTripulanteRepository.class);
            IServiceCollection.AddScoped(IVueloRepository.class, MemoryVueloRepository.class);
        }
}

package WebApi;

import Application.UseCases.Command.Tripulantes.CrearTripulanteHandler;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyHandler;
import Domain.Factories.ITripulanteFactory;
import Domain.Factories.TripulanteFactory;
import Domain.Infraestructure.MemoryRepository.MemoryTripulanteRepository;
import Domain.Repositories.ITripulanteRepository;
import kernel.IServiceCollection;
import kernel.http.Rest;
import kernel.mediator.IMediator;

public class App {
    public static void main(String[] args) throws Exception {

        
        IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        IMediator.registerHandler(CrearTripulanteHandler.class);

        IServiceCollection.AddTransient(ITripulanteFactory.class,TripulanteFactory.class);
        IServiceCollection.AddTransient(ITripulanteRepository.class, MemoryTripulanteRepository.class);

        // Create the kernel

        Rest.addController(TripulanteApi.class);
        Rest.start();
        // Rest.start(82);

    }
}


import Application.UseCases.Command.Tripulantes.CrearTripulanteHandler;
import Application.UseCases.Command.Vuelos.CrearVueloHandler;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyHandler;
import Application.UseCases.Queries.Vuelos.GetVueloByKeyHandler;
import Domain.Factories.ITripulanteFactory;
import Domain.Factories.IVueloFactory;
import Domain.Factories.TripulanteFactory;
import Domain.Factories.VueloFactory;
import Infraestructure.MemoryRepository.MemoryDatabase;
import Infraestructure.MemoryRepository.MemoryTripulanteRepository;
import Infraestructure.MemoryRepository.MemoryVueloRepository;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IVueloRepository;
import SharedKernel.extensions.IServiceCollection;
import SharedKernel.http.Rest;
import SharedKernel.mediator.IMediator;
import WebApi.Controllers.TripulanteController;
import WebApi.Controllers.VueloController;

public class App {


    public static void ConfigureServices() {
        SharedKernel.Extensions.AddKernel();
        Infraestructure.Extensions.AddInfraestructure();
        WebApi.Extensions.AddControllers();
    }

    public static void main(String[] args) throws Exception {

        ConfigureServices();

        // IMediator.registerHandler(GetVueloByKeyHandler.class);
        // IMediator.registerHandler(CrearVueloHandler.class);
        // IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        // IMediator.registerHandler(CrearTripulanteHandler.class);

        // IServiceCollection.AddSingleton(MemoryDatabase.class);

        // IServiceCollection.AddTransient(IVueloFactory.class, VueloFactory.class);
        // IServiceCollection.AddTransient(IVueloRepository.class, MemoryVueloRepository.class);
        // IServiceCollection.AddTransient(ITripulanteFactory.class, TripulanteFactory.class);
        // IServiceCollection.AddTransient(ITripulanteRepository.class, MemoryTripulanteRepository.class);

        // Rest.addController(VueloController.class);
        // Rest.addController(TripulanteController.class);
        // Rest.start();
        // Rest.start(82);

    }
}
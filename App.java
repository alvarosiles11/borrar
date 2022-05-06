

import Api.AsientoDisponibleApi;
import Api.TripulanteApi;
import Api.VueloApi;
import Application.UseCases.Command.AsientoDisponibles.CrearAsientoDisponibleHandler;
import Application.UseCases.Command.Tripulantes.CrearTripulanteHandler;
import Application.UseCases.Command.Vuelos.CrearVueloHandler;
import Application.UseCases.Queries.AsientoDisponibles.GetAsientoDisponibleByKeyHandler;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyHandler;
import Application.UseCases.Queries.Vuelos.GetVueloByKeyHandler;
import Domain.Factories.AsientoDisponibleFactory;
import Domain.Factories.IAsientoDisponibleFactory;
import Domain.Factories.ITripulanteFactory;
import Domain.Factories.IVueloFactory;
import Domain.Factories.TripulanteFactory;
import Domain.Factories.VueloFactory;
import Domain.Infraestructure.MemoryRepository.MemoryAsientoDisponibleRepository;
import Domain.Infraestructure.MemoryRepository.MemoryDatabase;
import Domain.Infraestructure.MemoryRepository.MemoryTripulanteRepository;
import Domain.Infraestructure.MemoryRepository.MemoryVueloRepository;
import Domain.Repositories.IAsientoDisponibleRepository;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IVueloRepository;
import SharedKernel.extensions.IServiceCollection;
import SharedKernel.http.Rest;
import SharedKernel.mediator.IMediator;

public class App {
    public static void main(String[] args) throws Exception {


        IMediator.registerHandler(GetVueloByKeyHandler.class);
        IMediator.registerHandler(CrearVueloHandler.class);
        IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        IMediator.registerHandler(CrearTripulanteHandler.class);
        IMediator.registerHandler(GetAsientoDisponibleByKeyHandler.class);
        IMediator.registerHandler(CrearAsientoDisponibleHandler.class);

        IServiceCollection.AddSingleton(MemoryDatabase.class);
        IServiceCollection.AddTransient(IVueloFactory.class, VueloFactory.class);
        IServiceCollection.AddTransient(IVueloRepository.class, MemoryVueloRepository.class);
        IServiceCollection.AddTransient(ITripulanteFactory.class, TripulanteFactory.class);
        IServiceCollection.AddTransient(ITripulanteRepository.class, MemoryTripulanteRepository.class);
        IServiceCollection.AddTransient(IAsientoDisponibleFactory.class, AsientoDisponibleFactory.class);
        IServiceCollection.AddTransient(IAsientoDisponibleRepository.class, MemoryAsientoDisponibleRepository.class);

        // Create the SharedKernel

        Rest.addController(VueloApi.class);
        Rest.addController(TripulanteApi.class);
        Rest.addController(AsientoDisponibleApi.class);
        Rest.start();
        // Rest.start(82);

    }
}

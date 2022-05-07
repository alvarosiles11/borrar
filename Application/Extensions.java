package Application;

import Application.UseCases.Command.Tripulantes.CrearTripulanteCommand;
import Application.UseCases.Command.Vuelos.CrearVueloHandler;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyHandler;
import Application.UseCases.Queries.Vuelos.GetVueloByKeyHandler;
import Domain.Factories.ITripulanteFactory;
import Domain.Factories.IVueloFactory;
import Domain.Factories.TripulanteFactory;
import Domain.Factories.VueloFactory;
import SharedKernel.extensions.IServiceCollection;
import SharedKernel.mediator.IMediator;

public class Extensions {

    public static void AddApplication() {
        // INFO:Usamos el IMediator del kernel en cambio del MediatR de Spring
        IMediator.registerHandler(GetVueloByKeyHandler.class);
        IMediator.registerHandler(CrearVueloHandler.class);
        IServiceCollection.AddTransient(IVueloFactory.class, VueloFactory.class);

        // INFO
        IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        IMediator.registerHandler(CrearTripulanteCommand.class);
        IServiceCollection.AddTransient(ITripulanteFactory.class, TripulanteFactory.class);

    }
}
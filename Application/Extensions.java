package Application;

import Application.UseCases.Command.Tripulantes.UpdateTripulanteWhenVueloCreadoHandler;
import Application.UseCases.Command.Vuelos.CrearVueloHandler;
import Application.UseCases.Queries.Vuelos.GetVueloByKeyHandler;
import Domain.Factories.IVueloFactory;
import Domain.Factories.VueloFactory;
import SharedKernel.extensions.IServiceCollection;
import SharedKernel.mediator.IMediator;

public class Extensions {

    public static void AddApplication() {
        // INFO:Usamos el IMediator del kernel en cambio del MediatR de Spring
        IMediator.registerHandler(GetVueloByKeyHandler.class);
        IMediator.registerHandler(CrearVueloHandler.class);

        IMediator.registerHandler(UpdateTripulanteWhenVueloCreadoHandler.class);

        IServiceCollection.AddTransient(IVueloFactory.class, VueloFactory.class);

     
    }
}
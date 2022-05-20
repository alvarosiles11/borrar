package Application;

import Application.UseCases.Command.Tripulantes.Crear.CrearTripulanteHandler;
import Application.UseCases.Command.Tripulantes.Editar.EditarTripulanteHandler;
import Application.UseCases.Command.Tripulantes.Eliminar.EliminarTripulanteHandler;
import Application.UseCases.Command.Vuelos.Crear.CrearVueloHandler;
import Application.UseCases.Command.Vuelos.Editar.EditarVueloHandler;
import Application.UseCases.Command.Vuelos.Eliminar.EliminarVueloHandler;
import Application.UseCases.Queries.Tripulantes.GetAll.GetAllTripulanteHandler;
import Application.UseCases.Queries.Tripulantes.GetByKey.GetTripulanteByKeyHandler;
import Application.UseCases.Queries.Vuelos.GetAll.GetAllVueloHandler;
import Application.UseCases.Queries.Vuelos.GetByKey.GetVueloByKeyHandler;
import Domain.Factories.ITripulanteFactory;
import Domain.Factories.IVueloFactory;
import Domain.Factories.TripulanteFactory;
import Domain.Factories.VueloFactory;
import SharedKernel.extensions.IServiceCollection;
import SharedKernel.mediator.IMediator;

public class Extensions {

    public static void AddApplication() {
        // INFO:Usamos el IMediator del kernel en cambio del MediatR de Spring
        IMediator.registerHandler(GetAllVueloHandler.class);
        IMediator.registerHandler(GetVueloByKeyHandler.class);
        IMediator.registerHandler(CrearVueloHandler.class);
        IMediator.registerHandler(EditarVueloHandler.class);
        IMediator.registerHandler(EliminarVueloHandler.class);

        // INFO:Tripulante
        IMediator.registerHandler(GetAllTripulanteHandler.class);
        IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        IMediator.registerHandler(CrearTripulanteHandler.class);
        IMediator.registerHandler(EditarTripulanteHandler.class);
        IMediator.registerHandler(EliminarTripulanteHandler.class);

        // IMediator.registerHandler(UpdateTripulanteWhenVueloCreadoHandler.class);
        IServiceCollection.AddTransient(IVueloFactory.class, VueloFactory.class);
        IServiceCollection.AddTransient(ITripulanteFactory.class, TripulanteFactory.class);
    }
}
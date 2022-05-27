package dmsnur.Application;

import dmsnur.Application.UseCases.Command.Tripulantes.UpdateTripulanteWhenVueloCreadoHandler;
import dmsnur.Application.UseCases.Command.Tripulantes.Crear.CrearTripulanteHandler;
import dmsnur.Application.UseCases.Command.Tripulantes.Editar.EditarTripulanteHandler;
import dmsnur.Application.UseCases.Command.Tripulantes.Eliminar.EliminarTripulanteHandler;
import dmsnur.Application.UseCases.Command.Vuelos.Crear.CrearVueloHandler;
import dmsnur.Application.UseCases.Command.Vuelos.Editar.EditarVueloHandler;
import dmsnur.Application.UseCases.Command.Vuelos.Eliminar.EliminarVueloHandler;
import dmsnur.Application.UseCases.Queries.Tripulantes.GetAll.GetAllTripulanteHandler;
import dmsnur.Application.UseCases.Queries.Tripulantes.GetByKey.GetTripulanteByKeyHandler;
import dmsnur.Application.UseCases.Queries.Vuelos.GetAll.GetAllVueloHandler;
import dmsnur.Application.UseCases.Queries.Vuelos.GetByKey.GetVueloByKeyHandler;
import dmsnur.Domain.Factories.ITripulanteFactory;
import dmsnur.Domain.Factories.IVueloFactory;
import dmsnur.Domain.Factories.TripulanteFactory;
import dmsnur.Domain.Factories.VueloFactory;
import dmsnur.SharedKernel.extensions.IServiceCollection;
import dmsnur.SharedKernel.mediator.IMediator;

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

        IMediator.registerHandler(UpdateTripulanteWhenVueloCreadoHandler.class);
        IServiceCollection.AddTransient(IVueloFactory.class, VueloFactory.class);
        IServiceCollection.AddTransient(ITripulanteFactory.class, TripulanteFactory.class);
    }
}
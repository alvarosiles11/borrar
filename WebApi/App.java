package WebApi;

import Application.UseCases.Command.Tripulantes.CrearTripulanteHandler;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyHandler;
import kernel.http.Rest;
import kernel.mediator.IMediator;

public class App {
    public static void main(String[] args) throws Exception {

        // Register handlers
        // IMediator.registerHandler(GetVueloByKeyHandler.class);
        // IMediator.registerHandler(CrearVueloHandler.class);
        IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        IMediator.registerHandler(CrearTripulanteHandler.class);

        // Create the kernel
        // Rest.addController(VueloApi.class);
        Rest.addController(TripulanteApi.class);
        Rest.start();
        // Rest.start(82);

    }
}

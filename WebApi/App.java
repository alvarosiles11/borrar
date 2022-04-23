package WebApi;

import Application.UseCases.Command.Vuelos.CrearVueloHandler;
import Application.UseCases.Queries.GetVueloByKeyHandler;
import kernel.http.Rest;
import kernel.mediator.IMediator;

public class App {
    public static void main(String[] args) throws Exception {

        // Register handlers
        IMediator.registerHandler(GetVueloByKeyHandler.class);
        IMediator.registerHandler(CrearVueloHandler.class);

        // Create the kernel
        Rest.addController(VueloApi.class);
        Rest.start();

    }
}

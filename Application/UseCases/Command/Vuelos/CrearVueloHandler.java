package Application.UseCases.Command.Vuelos;

import java.util.UUID;
import kernel.mediator.RequestHandler;

public class CrearVueloHandler implements RequestHandler<CrearVueloCommand, UUID> {

	@Override
	public UUID handle(CrearVueloCommand arg0) {
		System.out.println("Entro al handler");
		return UUID.randomUUID();

	}

}

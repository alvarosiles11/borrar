package Application.UseCases.Command.Vuelos;

import java.util.UUID;

import kernel.mediator.RequestHandler;

public class CrearListaTripulantesHandler implements RequestHandler<CrearListaTripulantesCommand, UUID> {

	@Override
	public UUID handle(CrearListaTripulantesCommand arg0) {
		System.out.println("Entro al handler");
		return UUID.randomUUID();

	}

}

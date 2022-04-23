package Application.UseCases.Command.Vuelos;

import java.util.UUID;

import kernel.mediator.RequestHandler;

public class CrearListaAsientosDisponiblesHandler
		implements RequestHandler<CrearListaAsientosDisponiblesCommand, UUID> {

	@Override
	public UUID handle(CrearListaAsientosDisponiblesCommand arg0) {
		System.out.println("Entro al handler");
		return UUID.randomUUID();

	}

}

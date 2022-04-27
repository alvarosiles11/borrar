package Application.UseCases.Queries.Vuelos;

import java.util.UUID;

import Application.Dto.VueloDto;
import kernel.mediator.Request;

public class GetVueloByKeyQuery implements Request<VueloDto> {

	public UUID key;

	public GetVueloByKeyQuery() {
		System.out.println("Entro a GetVueloByKeyQuery");
	}

	public GetVueloByKeyQuery(UUID key) {
		this.key = key;
	}
}

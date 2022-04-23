package Application.UseCases.Queries;

import java.util.UUID;

import Application.Dto.Vuelo.VueloDto;
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

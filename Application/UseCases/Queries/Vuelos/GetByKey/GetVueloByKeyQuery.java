package Application.UseCases.Queries.Vuelos.GetByKey;

import java.util.UUID;

import Application.Dto.VueloDto;
import SharedKernel.mediator.Request;

public class GetVueloByKeyQuery implements Request<VueloDto> {

	public UUID Key;

	public GetVueloByKeyQuery(UUID Key) {
		this.Key = Key;
	}
}

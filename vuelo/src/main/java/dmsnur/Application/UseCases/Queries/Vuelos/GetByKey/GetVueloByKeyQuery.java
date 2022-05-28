package dmsnur.Application.UseCases.Queries.Vuelos.GetByKey;

import java.util.UUID;

import dmsnur.Application.Dto.VueloDto;
import dmsnur.SharedKernel.mediator.Request;

public class GetVueloByKeyQuery implements Request<VueloDto> {

	public UUID Key;

	public GetVueloByKeyQuery(UUID Key) {
		this.Key = Key;
	}
}

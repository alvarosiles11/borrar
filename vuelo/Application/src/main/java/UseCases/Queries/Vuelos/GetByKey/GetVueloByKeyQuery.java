package UseCases.Queries.Vuelos.GetByKey;

import java.util.UUID;

import Dto.VueloDto;
import fourteam.mediator.Request;

public class GetVueloByKeyQuery implements Request<VueloDto> {

	public UUID Key;

	public GetVueloByKeyQuery(UUID Key) {
		this.Key = Key;
	}
}

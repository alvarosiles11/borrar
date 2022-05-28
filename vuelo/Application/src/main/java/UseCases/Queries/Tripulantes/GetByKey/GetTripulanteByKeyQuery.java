package UseCases.Queries.Tripulantes.GetByKey;

import java.util.UUID;

import Dto.VueloDto;
import fourteam.mediator.Request;

public class GetTripulanteByKeyQuery implements Request<VueloDto> {

	public UUID keyVuelo;

	public GetTripulanteByKeyQuery(UUID keyVuelo) {
		this.keyVuelo = keyVuelo;
	}
}

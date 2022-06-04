package UseCases.Queries.Tripulantes.GetByKey;

import java.util.UUID;

import Dto.VueloDto;
import fourteam.mediator.Request;

public class GetTripulanteByKeyQuery implements Request<VueloDto> {

	public UUID key;

	public GetTripulanteByKeyQuery(UUID key) {
		this.key = key;
	}
}

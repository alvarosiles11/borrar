package Application.UseCases.Queries.Tripulantes.GetByKey;

import java.util.UUID;

import Application.Dto.VueloDto;
import SharedKernel.mediator.Request;

public class GetTripulanteByKeyQuery implements Request<VueloDto> {

	public UUID keyVuelo;

	public GetTripulanteByKeyQuery(UUID keyVuelo) {
		this.keyVuelo = keyVuelo;
	}
}

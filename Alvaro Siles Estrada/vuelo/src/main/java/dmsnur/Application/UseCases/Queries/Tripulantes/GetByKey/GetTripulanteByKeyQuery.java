package dmsnur.Application.UseCases.Queries.Tripulantes.GetByKey;

import java.util.UUID;

import dmsnur.Application.Dto.VueloDto;
import dmsnur.SharedKernel.mediator.Request;

public class GetTripulanteByKeyQuery implements Request<VueloDto> {

	public UUID keyVuelo;

	public GetTripulanteByKeyQuery(UUID keyVuelo) {
		this.keyVuelo = keyVuelo;
	}
}

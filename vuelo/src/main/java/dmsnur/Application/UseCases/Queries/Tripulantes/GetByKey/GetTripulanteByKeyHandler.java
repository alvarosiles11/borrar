package dmsnur.Application.UseCases.Queries.Tripulantes.GetByKey;

import dmsnur.Application.Dto.TripulanteDto;
import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.Domain.Repositories.ITripulanteRepository;
import dmsnur.SharedKernel.http.HttpStatus;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

public class GetTripulanteByKeyHandler implements RequestHandler<GetTripulanteByKeyQuery, TripulanteDto> {

	private ITripulanteRepository _ITripulanteRepository;

	public GetTripulanteByKeyHandler(ITripulanteRepository iTripulanteRepository) {
		this._ITripulanteRepository = iTripulanteRepository;
	}

	@Override
	public TripulanteDto handle(GetTripulanteByKeyQuery request) throws HttpException {
		Tripulante tripulante = _ITripulanteRepository.FindByKey(request.keyVuelo);
		if (tripulante == null) {
			throw new HttpException(HttpStatus.BAD_REQUEST, "tripulante no encontrado");
		}
		// creo el dto
		TripulanteDto tripulanteDto = new TripulanteDto();
		// lleno el dto
		tripulanteDto.keyTripulante = tripulante.keyTripulante;
		tripulanteDto.cargo = tripulante.cargo;
		// devuelvo el dto
		return tripulanteDto;
	}
}
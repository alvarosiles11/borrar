package UseCases.Queries.Tripulantes.GetByKey;

import Dto.TripulanteDto;
import Model.Vuelos.Tripulante;
import Repositories.ITripulanteRepository;
import fourteam.http.HttpStatus;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.RequestHandler;

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
package Application.UseCases.Queries.Tripulantes.GetByKey;

import Application.Dto.TripulanteDto;
import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import SharedKernel.http.HttpStatus;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

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
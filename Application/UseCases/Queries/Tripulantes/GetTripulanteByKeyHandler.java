package Application.UseCases.Queries.Tripulantes;

import Application.Dto.TripulanteDto;
import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import SharedKernel.mediator.RequestHandler;

public class GetTripulanteByKeyHandler implements RequestHandler<GetTripulanteByKeyQuery, TripulanteDto> {

    private ITripulanteRepository _ITripulanteRepository;

    public GetTripulanteByKeyHandler(ITripulanteRepository iTripulanteRepository) {
        this._ITripulanteRepository = iTripulanteRepository;
    }

    @Override
    public TripulanteDto handle(GetTripulanteByKeyQuery arg0) {

        System.out.println(arg0.Key);
        Tripulante tripulante = _ITripulanteRepository.FindByKey(arg0.Key);
        if (tripulante == null) {
            return null;
        }

        TripulanteDto tripulanteDto = new TripulanteDto();
        tripulanteDto.keyTripulante = tripulante.keyTripulante;
        tripulanteDto.cargo = tripulante.cargo;
        return tripulanteDto;

    }

}

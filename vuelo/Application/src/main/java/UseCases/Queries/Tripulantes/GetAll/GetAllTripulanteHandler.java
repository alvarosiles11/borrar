package UseCases.Queries.Tripulantes.GetAll;

import java.util.List;

import Model.Vuelos.Tripulante;
import Repositories.ITripulanteRepository;
import fourteam.mediator.RequestHandler;

public class GetAllTripulanteHandler implements RequestHandler<GetAllTripulanteQuery, List<Tripulante>> {

    private ITripulanteRepository _iTripulanteRepository;

    public GetAllTripulanteHandler(ITripulanteRepository iTripulanteRepository) {
        this._iTripulanteRepository = iTripulanteRepository;
    }

    @Override
    public List<Tripulante> handle(GetAllTripulanteQuery request) {
        return _iTripulanteRepository.GetAll();
    }
}
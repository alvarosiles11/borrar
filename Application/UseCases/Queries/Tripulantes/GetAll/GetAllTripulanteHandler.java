package Application.UseCases.Queries.Tripulantes.GetAll;

import java.util.List;

import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IVueloRepository;
import SharedKernel.mediator.RequestHandler;

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
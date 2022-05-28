package dmsnur.Application.UseCases.Queries.Tripulantes.GetAll;

import java.util.List;

import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.Domain.Repositories.ITripulanteRepository;
import dmsnur.SharedKernel.mediator.RequestHandler;

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
package Application.UseCases.Queries.Vuelos.GetAll;

import java.util.List;

import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IVueloRepository;
import SharedKernel.mediator.RequestHandler;

public class GetAllVueloHandler implements RequestHandler<GetAllVueloQuery, List<Vuelo>> {

    private IVueloRepository _iVueloRepository;

    public GetAllVueloHandler(IVueloRepository iVueloRepository) {
        this._iVueloRepository = iVueloRepository;
    }

    @Override
    public List<Vuelo> handle(GetAllVueloQuery request) {
        return _iVueloRepository.GetAll();
    }
}

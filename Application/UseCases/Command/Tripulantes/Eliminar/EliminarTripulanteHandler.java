package Application.UseCases.Command.Tripulantes.Eliminar;

import Domain.Factories.ITripulanteFactory;
import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;
import SharedKernel.http.HttpStatus;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

public class EliminarTripulanteHandler implements RequestHandler<EliminarTripulanteCommand, Tripulante> {

    // Declaro Factory, Repository, UnitOfWork
    protected ITripulanteFactory _ITripulanteFactory;
    protected ITripulanteRepository _ITripulanteRepository;
    protected IUnitOfWork _unitOfWor;

    // Constructor
    public EliminarTripulanteHandler(ITripulanteFactory iTripulanteFactory, ITripulanteRepository iTripulanteRepository,
            IUnitOfWork unitOfWor) {
        this._ITripulanteFactory = iTripulanteFactory;
        this._ITripulanteRepository = iTripulanteRepository;
        this._unitOfWor = unitOfWor;
    }

    @Override
    public Tripulante handle(EliminarTripulanteCommand request) throws HttpException {
        Tripulante _Tripulante = _ITripulanteRepository.FindByKey(request._TripulanteDto.key);
        if (_Tripulante == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Tripulante no encontrada");
        }
        return _ITripulanteRepository.Delete(_Tripulante);
    }
}
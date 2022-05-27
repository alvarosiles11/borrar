package Application.UseCases.Command.Tripulantes.Editar;

import Domain.Factories.ITripulanteFactory;
import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;
import SharedKernel.http.HttpStatus;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

public class EditarTripulanteHandler implements RequestHandler<EditarTripulanteCommand, Tripulante> {

    // Declaro Factory, Repository, UnitOfWork
    protected ITripulanteFactory _ITripulanteFactory;
    protected ITripulanteRepository _ITripulanteRepository;
    protected IUnitOfWork _unitOfWor;

    // Constructor
    public EditarTripulanteHandler(ITripulanteFactory iTripulanteFactory, ITripulanteRepository iTripulanteRepository,
            IUnitOfWork unitOfWor) {
        this._ITripulanteFactory = iTripulanteFactory;
        this._ITripulanteRepository = iTripulanteRepository;
        this._unitOfWor = unitOfWor;
    }

    @Override
    public Tripulante handle(EditarTripulanteCommand request) throws HttpException {
        Tripulante _Tripulante = _ITripulanteRepository.FindByKey(request._TripulanteDto.key);
        if (_Tripulante == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Tripulante no encontrada");
        }
        _Tripulante.key = request._TripulanteDto.key;
        _ITripulanteRepository.Update(_Tripulante);
        return _Tripulante;
    }
}
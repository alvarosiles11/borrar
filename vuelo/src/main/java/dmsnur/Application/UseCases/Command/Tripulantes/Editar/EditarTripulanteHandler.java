package dmsnur.Application.UseCases.Command.Tripulantes.Editar;

import dmsnur.Domain.Factories.ITripulanteFactory;
import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.Domain.Repositories.ITripulanteRepository;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.SharedKernel.http.HttpStatus;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

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
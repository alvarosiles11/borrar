package UseCases.Command.Tripulantes.Editar;

import Factories.ITripulanteFactory;
import Model.Vuelos.Tripulante;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;
import fourteam.http.HttpStatus;
import fourteam.mediator.RequestHandler;

public class EditarTripulanteHandler
  implements RequestHandler<EditarTripulanteCommand, Tripulante> {

  // Declaro Factory, Repository, UnitOfWork
  protected ITripulanteFactory _ITripulanteFactory;
  protected ITripulanteRepository _ITripulanteRepository;
  protected IUnitOfWork _unitOfWor;

  // Constructor
  public EditarTripulanteHandler(
    ITripulanteFactory iTripulanteFactory,
    ITripulanteRepository iTripulanteRepository,
    IUnitOfWork unitOfWor
  ) {
    this._ITripulanteFactory = iTripulanteFactory;
    this._ITripulanteRepository = iTripulanteRepository;
    this._unitOfWor = unitOfWor;
  }

  @Override
  public Tripulante handle(EditarTripulanteCommand request)
    throws HttpException {
    Tripulante _Tripulante = _ITripulanteRepository.FindByKey(
      request._TripulanteDto.key
    );
    if (_Tripulante == null) {
      throw new HttpException(
        HttpStatus.BAD_REQUEST,
        "Tripulante no encontrada"
      );
    }
    _Tripulante.key = request._TripulanteDto.key;
    _Tripulante.keyVuelo = request._TripulanteDto.keyVuelo;
    _Tripulante.keyTripulante = request._TripulanteDto.keyTripulante;
    _Tripulante.cargo = request._TripulanteDto.cargo;
    _ITripulanteRepository.Update(_Tripulante);
    return _Tripulante;
  }
}

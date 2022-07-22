package UseCases.Command.Tripulantes.Eliminar;

import Factories.ITripulanteFactory;
import Model.Vuelos.Tripulante;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;
import fourteam.http.HttpStatus;
import fourteam.mediator.RequestHandler;

public class EliminarTripulanteHandler
<<<<<<< Updated upstream
  implements RequestHandler<EliminarTripulanteCommand, Tripulante> {
=======
    implements RequestHandler<EliminarTripulanteCommand, Tripulante> {
>>>>>>> Stashed changes

  // Declaro Factory, Repository, UnitOfWork
  protected ITripulanteFactory _ITripulanteFactory;
  protected ITripulanteRepository _ITripulanteRepository;
  protected IUnitOfWork _unitOfWor;

  // Constructor
  public EliminarTripulanteHandler(
<<<<<<< Updated upstream
    ITripulanteFactory iTripulanteFactory,
    ITripulanteRepository iTripulanteRepository,
    IUnitOfWork unitOfWor
  ) {
=======
      ITripulanteFactory iTripulanteFactory,
      ITripulanteRepository iTripulanteRepository,
      IUnitOfWork unitOfWor) {
>>>>>>> Stashed changes
    this._ITripulanteFactory = iTripulanteFactory;
    this._ITripulanteRepository = iTripulanteRepository;
    this._unitOfWor = unitOfWor;
  }

  @Override
  public Tripulante handle(EliminarTripulanteCommand request)
<<<<<<< Updated upstream
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
    return _ITripulanteRepository.Delete(_Tripulante);
  }
}
=======
      throws HttpException {
    Tripulante _Tripulante = _ITripulanteRepository.FindByKey(
        request._TripulanteDto.key);
    if (_Tripulante == null) {
      throw new HttpException(
          HttpStatus.BAD_REQUEST,
          "Tripulante no encontrada");
    }
    return _ITripulanteRepository.Delete(_Tripulante);
  }
}
>>>>>>> Stashed changes

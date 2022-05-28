package UseCases.Command.Vuelos.Eliminar;

import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import fourteam.http.HttpStatus;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.RequestHandler;

public class EliminarVueloHandler implements RequestHandler<EliminarVueloCommand, Vuelo> {

    // Declaro Factory, Repository, UnitOfWork
    protected IVueloFactory _IVueloFactory;
    protected IVueloRepository _IVueloRepository;
    protected IUnitOfWork _unitOfWor;

    // Constructor
    public EliminarVueloHandler(IVueloFactory iVueloFactory, IVueloRepository iVueloRepository, IUnitOfWork unitOfWor) {
        _IVueloFactory = iVueloFactory;
        this._IVueloRepository = iVueloRepository;
        this._unitOfWor = unitOfWor;
    }

    @Override
    public Vuelo handle(EliminarVueloCommand request) throws HttpException {
        Vuelo _Vuelo = _IVueloRepository.FindByKey(request._VueloDto.key);
        if (_Vuelo == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Vuelo no encontrada");
        }
        return _IVueloRepository.Delete(_Vuelo);
    }
}
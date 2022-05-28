package dmsnur.Application.UseCases.Command.Vuelos.Eliminar;

import dmsnur.Domain.Factories.IVueloFactory;
import dmsnur.Domain.Model.Vuelos.Vuelo;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.Domain.Repositories.IVueloRepository;
import dmsnur.SharedKernel.http.HttpStatus;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

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
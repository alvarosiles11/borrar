package Application.UseCases.Command.Vuelos.Editar;

import Domain.Factories.IVueloFactory;
import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IUnitOfWork;
import Domain.Repositories.IVueloRepository;
import SharedKernel.http.HttpStatus;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

public class EditarVueloHandler implements RequestHandler<EditarVueloCommand, Vuelo> {

    // Declaro Factory, Repository, UnitOfWork
    private IVueloFactory _IVueloFactory;
    private IVueloRepository _IVueloRepository;
    private IUnitOfWork _unitOfWor;

    // Constructor
    public EditarVueloHandler(IVueloFactory iVueloFactory, IVueloRepository iVueloRepository, IUnitOfWork unitOfWor) {
        this._IVueloFactory = iVueloFactory;
        this._IVueloRepository = iVueloRepository;
        this._unitOfWor = unitOfWor;
    }

    @Override
    public Vuelo handle(EditarVueloCommand request) throws HttpException {
        Vuelo _Vuelo = _IVueloRepository.FindByKey(request._VueloDto.key);
        if (_Vuelo == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Vuelo no encontrada");
        }
        _Vuelo.key = request._VueloDto.key;
        _IVueloRepository.Update(_Vuelo);
        return _Vuelo;
    }
}
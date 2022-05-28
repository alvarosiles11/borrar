package UseCases.Command.Vuelos.Editar;

import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import fourteam.http.HttpStatus;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.RequestHandler;

public class EditarVueloHandler implements RequestHandler<EditarVueloCommand, Vuelo> {

    // Declaro Factory, Repository, UnitOfWork
    protected IVueloFactory _IVueloFactory;
    protected IVueloRepository _IVueloRepository;
    protected IUnitOfWork _unitOfWor;

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
        _Vuelo.nroVuelo = request._VueloDto.nroVuelo;
        _Vuelo.keyAeronave = request._VueloDto.keyAeronave;
        _Vuelo.keyAeropuertoOrigen = request._VueloDto.keyAeropuertoOrigen;
        _Vuelo.keyAeropuertoDestino = request._VueloDto.keyAeropuertoDestino;
        _Vuelo.fecha_salida = request._VueloDto.fecha_salida;
        _Vuelo.fecha_arribe = request._VueloDto.fecha_arribe;
        // _Vuelo.listaTripulante = request._VueloDto.listaTripulante;
        _IVueloRepository.Update(_Vuelo);
        return _Vuelo;
    }
}
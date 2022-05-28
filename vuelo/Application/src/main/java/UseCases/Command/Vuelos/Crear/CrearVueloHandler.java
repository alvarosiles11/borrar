package UseCases.Command.Vuelos.Crear;

import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.RequestHandler;

public class CrearVueloHandler implements RequestHandler<CrearVueloCommand, Vuelo> {

	// Declaro Factory, Repository, UnitOfWork
	private IVueloFactory _IVueloFactory;
	private IVueloRepository _IVueloRepository;
	private IUnitOfWork _unitOfWor;

	// Constructor
	public CrearVueloHandler(IVueloFactory iVueloFactory, IVueloRepository iVueloRepository, IUnitOfWork unitOfWor) {
		this._IVueloFactory = iVueloFactory;
		this._IVueloRepository = iVueloRepository;
		this._unitOfWor = unitOfWor;
	}

	// hilo de ejecucion
	@Override
	public Vuelo handle(CrearVueloCommand arg0) throws HttpException {

		Vuelo vuelo = _IVueloFactory.Create(arg0.nroVuelo, arg0.keyAeronave, arg0.keyAeropuertoOrigen,
				arg0.keyAeropuertoDestino, arg0.fecha_salida, arg0.fecha_arribe);
		// creo el evento
		vuelo.eventCreado();
		_IVueloRepository.Create(vuelo);
		_unitOfWor.commit();
		return vuelo;
	}
}
package Application.UseCases.Command.Vuelos.Crear;

import java.lang.reflect.Constructor;

import Domain.Factories.IVueloFactory;
import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IUnitOfWork;
import Domain.Repositories.IVueloRepository;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

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
				arg0.keyAeropuertoDestino, arg0.fecha_salida, arg0.fecha_arribe );

		// creo el evento
		vuelo.eventCreado();
		// guardo el evento
		_IVueloRepository.Create(vuelo);
		_unitOfWor.commit();
		return vuelo;
	}
}
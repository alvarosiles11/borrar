package UseCases.Command.Aeronaves.Crear;

import Factories.IAeronaveFactory;
import Model.Aeronaves.Aeronave;
import Repositories.IAeronaveRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.RequestHandler;

public class CrearAeronaveHandler implements RequestHandler<CrearAeronaveCommand, Aeronave> {

	// Declaro Factory, Repository, UnitOfWork
	private IAeronaveFactory _IAeronaveFactory;
	private IAeronaveRepository _IAeronaveRepository;
	private IUnitOfWork _unitOfWor;

	// Constructor
	public CrearAeronaveHandler(
			IAeronaveFactory iAeronaveFactory, IAeronaveRepository iAeronaveRepository, IUnitOfWork unitOfWor) {
		this._IAeronaveFactory = iAeronaveFactory;
		this._IAeronaveRepository = iAeronaveRepository;
		this._unitOfWor = unitOfWor;
	}

	// hilo de ejecucion
	@Override
	public Aeronave handle(CrearAeronaveCommand arg0) throws HttpException {
		Aeronave aeronave = _IAeronaveFactory.Create(arg0.matricula);
		_IAeronaveRepository.Create(aeronave);
		_unitOfWor.commit();
		return aeronave;
	}
}
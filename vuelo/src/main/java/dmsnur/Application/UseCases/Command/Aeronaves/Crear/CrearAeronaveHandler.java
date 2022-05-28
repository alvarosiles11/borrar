package dmsnur.Application.UseCases.Command.Aeronaves.Crear;

import dmsnur.Domain.Factories.IAeronaveFactory;
import dmsnur.Domain.Model.Aeronaves.Aeronave;
import dmsnur.Domain.Repositories.IAeronaveRepository;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

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
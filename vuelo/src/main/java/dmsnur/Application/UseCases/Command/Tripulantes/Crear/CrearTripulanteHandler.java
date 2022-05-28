package dmsnur.Application.UseCases.Command.Tripulantes.Crear;

import dmsnur.Domain.Factories.ITripulanteFactory;
import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.Domain.Repositories.ITripulanteRepository;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

public class CrearTripulanteHandler implements RequestHandler<CrearTripulanteCommand, Tripulante> {

	// Declaro Factory, Repository, UnitOfWork
	private ITripulanteFactory _ITripulanteFactory;
	private ITripulanteRepository _ITripulanteRepository;
	private IUnitOfWork _unitOfWor;

	// Constructor
	public CrearTripulanteHandler(ITripulanteFactory iTripulanteFactory, ITripulanteRepository iTripulanteRepository,
			IUnitOfWork unitOfWor) {
		this._ITripulanteFactory = iTripulanteFactory;
		this._ITripulanteRepository = iTripulanteRepository;
		this._unitOfWor = unitOfWor;
	}

	// hilo de ejecucion
	@Override
	public Tripulante handle(CrearTripulanteCommand arg0) throws HttpException {
		Tripulante tripulante = _ITripulanteFactory.Create(arg0.keyVuelo, arg0.keyTripulante, arg0.cargo);
		_ITripulanteRepository.Create(tripulante);
		_unitOfWor.commit();
		return tripulante;
	}
}
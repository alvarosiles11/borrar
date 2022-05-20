package Application.UseCases.Command.Tripulantes.Crear;

import Domain.Factories.ITripulanteFactory;
import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

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
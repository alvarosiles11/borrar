package Application.UseCases.Command.Vuelos;

import Domain.Factories.IVueloFactory;
import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IUnitOfWork;
import Domain.Repositories.IVueloRepository;
import SharedKernel.mediator.RequestHandler;

public class CrearVueloHandler implements RequestHandler<CrearVueloCommand, Vuelo> {

	private IVueloFactory _IVueloFactory;
	private IVueloRepository _IVueloRepository;
	private IUnitOfWork _unitOfWor;

	public CrearVueloHandler(IVueloFactory iVueloFactory, IVueloRepository iVueloRepository, IUnitOfWork unitOfWor) {
		this._IVueloFactory = iVueloFactory;
		this._IVueloRepository = iVueloRepository;
		this._unitOfWor = unitOfWor;
	}

	@Override
	public Vuelo handle(CrearVueloCommand arg0) {
		Vuelo vueloDTO;
		vueloDTO = _IVueloFactory.Create(arg0.nroVuelo, arg0.keyAeronave, arg0.keyAeropuertoOrigen,
				arg0.keyAeropuertoDestino, arg0.fecha_salida, arg0.fecha_arribe, arg0.listaTripulante);

				vueloDTO.eventCreado();


		_IVueloRepository.Create(vueloDTO);
		_unitOfWor.commit();
		return vueloDTO;
	}
}
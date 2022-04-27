package Application.UseCases.Command.Vuelos;

import Domain.Factories.IVueloFactory;
import Domain.Model.Vuelos.Vuelo;
import kernel.mediator.RequestHandler;

public class CrearVueloHandler implements RequestHandler<CrearVueloCommand, Vuelo> {

	private IVueloFactory _IVueloFactory;

	@Override
	public Vuelo handle(CrearVueloCommand arg0) {
		Vuelo vuelo = _IVueloFactory.Create(arg0.nrovuelo);
		return vuelo;
	}

	public CrearVueloHandler(IVueloFactory iVueloFactory) {
		this._IVueloFactory = iVueloFactory;
	}

}

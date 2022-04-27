package Application.UseCases.Command.Vuelos;

import Domain.Factories.IVueloFactory;
import Domain.Model.Vuelos.Vuelo;
import kernel.mediator.RequestHandler;

public class CrearVueloHandler implements RequestHandler<CrearVueloCommand, Vuelo> {

	private IVueloFactory _IVueloFactory;

	@Override
	public Vuelo handle(CrearVueloCommand arg0) {
		Vuelo obj = _IVueloFactory.Create(arg0.nrovuelo, arg0.listaTripulante, arg0.listaAsientoDisponible);
		return obj;
	}


	public CrearVueloHandler(IVueloFactory factory) {
	this._IVueloFactory = factory;
	}
 
}
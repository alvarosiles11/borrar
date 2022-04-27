package Application.UseCases.Command.Vuelos;

import Domain.Model.Vuelos.Vuelo;
import kernel.mediator.RequestHandler;

public class CrearVueloHandler implements RequestHandler<CrearVueloCommand, Vuelo> {

	@Override
	public Vuelo handle(CrearVueloCommand arg0) {
		// Vuelo vuelo = _ITripulanteFactory.Create(arg0.descripcion);
		return null;
	}

	// private ITripulanteFactory _ITripulanteFactory;

	// INFO = "Constructor de CrearTripulanteHandler"
	// public CrearTripulanteHandler(ITripulanteFactory ITripulanteFactory) {
	// this._ITripulanteFactory = ITripulanteFactory;
	// }

	// INFO = "HILO Metodo que crea un tripulante"
	// @Override
	// public Tripulante handle(CrearTripulanteCommand arg0) {
	// Tripulante tripulante = _ITripulanteFactory.Create(arg0.descripcion);
	// return tripulante;
	// }

}

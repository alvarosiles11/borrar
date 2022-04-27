package Application.UseCases.Command.Tripulantes;

import Domain.Factories.ITripulanteFactory;
import Domain.Model.Vuelos.Tripulante;
import kernel.mediator.RequestHandler;

public class CrearTripulanteHandler implements RequestHandler<CrearTripulanteCommand, Tripulante> {

    private ITripulanteFactory _ITripulanteFactory;

    // INFO = "Constructor de CrearTripulanteHandler"
    public CrearTripulanteHandler(ITripulanteFactory ITripulanteFactory) {
        this._ITripulanteFactory = ITripulanteFactory;
    }

    // INFO = "HILO Metodo que crea un tripulante"
    @Override
    public Tripulante handle(CrearTripulanteCommand arg0) {
        Tripulante tripulante = _ITripulanteFactory.Create(arg0.descripcion);
        return tripulante;
    }
}

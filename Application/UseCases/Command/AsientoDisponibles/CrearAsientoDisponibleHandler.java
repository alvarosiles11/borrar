package Application.UseCases.Command.AsientoDisponibles;

import Domain.Model.Vuelos.AsientoDisponible;
import kernel.mediator.RequestHandler;

public class CrearAsientoDisponibleHandler implements RequestHandler<CrearAsientoDisponibleCommand, AsientoDisponible> {

    // private ITripulanteFactory _ITripulanteFactory;

    // INFO = "Constructor de CrearTripulanteHandler"
    // public CrearAsientoDisponibleHandler(ITripulanteFactory ITripulanteFactory) {
    // this._ITripulanteFactory = ITripulanteFactory;
    // }

    // INFO = "HILO Metodo que crea un tripulante"
    // @Override
    // public Tripulante handle(CrearTripulanteCommand arg0) {
    // Tripulante tripulante = _ITripulanteFactory.Create(arg0.descripcion);
    // return tripulante;
    // }

    // TODO FaLTa Factory
    @Override
    public AsientoDisponible handle(CrearAsientoDisponibleCommand arg0) {
        return null;
    }
}

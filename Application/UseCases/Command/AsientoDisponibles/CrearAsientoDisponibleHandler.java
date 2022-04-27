package Application.UseCases.Command.AsientoDisponibles;

import Domain.Factories.IAsientoDisponibleFactory;
import Domain.Model.Vuelos.AsientoDisponible;
import kernel.mediator.RequestHandler;

public class CrearAsientoDisponibleHandler implements RequestHandler<CrearAsientoDisponibleCommand, AsientoDisponible> {

    private IAsientoDisponibleFactory _IAsientoDisponibleFactory;

    public CrearAsientoDisponibleHandler(IAsientoDisponibleFactory iAsientoDisponibleFactory) {
        this._IAsientoDisponibleFactory = iAsientoDisponibleFactory;
    }

    @Override
    public AsientoDisponible handle(CrearAsientoDisponibleCommand arg0) {
        AsientoDisponible tripulante = _IAsientoDisponibleFactory.Create(arg0.nrovuelo, arg0.clase, arg0.precio, arg0.estado);
        return tripulante;
    }

}

package Application.UseCases.Command.AsientoDisponibles;

import Domain.Factories.IAsientoDisponibleFactory;
import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Repositories.IAsientoDisponibleRepository;
import SharedKernel.mediator.RequestHandler;

public class CrearAsientoDisponibleHandler implements RequestHandler<CrearAsientoDisponibleCommand, AsientoDisponible> {

    private IAsientoDisponibleFactory _IAsientoDisponibleFactory;
    private IAsientoDisponibleRepository _IAsientoDisponibleRepository;

    public CrearAsientoDisponibleHandler(IAsientoDisponibleFactory iAsientoDisponibleFactory,
            IAsientoDisponibleRepository iAsientoDisponibleRepository) {
        this._IAsientoDisponibleFactory = iAsientoDisponibleFactory;
        this._IAsientoDisponibleRepository = iAsientoDisponibleRepository;
    }

    @Override
    public AsientoDisponible handle(CrearAsientoDisponibleCommand arg0) {
        AsientoDisponible AsientoDisponibleDto;
        AsientoDisponibleDto = _IAsientoDisponibleFactory.Create(arg0.nrovuelo, arg0.matricula, arg0.clase, arg0.precio,
                arg0.estado);
        _IAsientoDisponibleRepository.Create(AsientoDisponibleDto);
        return AsientoDisponibleDto;
    }

}

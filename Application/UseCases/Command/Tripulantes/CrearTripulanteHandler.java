package Application.UseCases.Command.Tripulantes;

import Domain.Factories.ITripulanteFactory;
import Domain.Model.Vuelos.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import SharedKernel.mediator.RequestHandler;

public class CrearTripulanteHandler implements RequestHandler<CrearTripulanteCommand, Tripulante> {

    private ITripulanteFactory _ITripulanteFactory;
    private ITripulanteRepository _ITripulanteRepository;

    // INFO = "Constructor de CrearTripulanteHandler"
    public CrearTripulanteHandler(ITripulanteFactory ITripulanteFactory, ITripulanteRepository ITripulanteRepository) {
        this._ITripulanteFactory = ITripulanteFactory;
        this._ITripulanteRepository = ITripulanteRepository;
    }

    // INFO = "HILO Metodo que crea un tripulante"
    @Override
    public Tripulante handle(CrearTripulanteCommand arg0) {
        Tripulante tripulanteDto;
        tripulanteDto = _ITripulanteFactory.Create(arg0.nroVuelo,arg0.descripcion,arg0.nombre);
        _ITripulanteRepository.Create(tripulanteDto);
        return tripulanteDto;
    }
}

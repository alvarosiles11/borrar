package Application.UseCases.Queries.AsientoDisponibles;

import Application.Dto.AsientoDisponibleDto;
import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Repositories.IAsientoDisponibleRepository;
import SharedKernel.mediator.RequestHandler;

public class GetAsientoDisponibleByKeyHandler
        implements RequestHandler<GetAsientoDisponibleByKeyQuery, AsientoDisponibleDto> {

    private IAsientoDisponibleRepository _IAsientoDisponibleRepository;

    public GetAsientoDisponibleByKeyHandler(IAsientoDisponibleRepository iAsientoDisponibleRepository) {
        this._IAsientoDisponibleRepository = iAsientoDisponibleRepository;
    }

    @Override
    public AsientoDisponibleDto handle(GetAsientoDisponibleByKeyQuery arg0) {
        System.out.println(arg0.Key);

        AsientoDisponible asientoDisponible = _IAsientoDisponibleRepository.FindByKey(arg0.Key);
        if (asientoDisponible == null) {
            return null;
        }

        AsientoDisponibleDto asientoDisponibleDto = new AsientoDisponibleDto();
        asientoDisponibleDto.nrovuelo = asientoDisponible.nrovuelo;
        return asientoDisponibleDto;
    }

}

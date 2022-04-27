package Application.UseCases.Queries.AsientoDisponibles;

import Application.Dto.AsientoDisponibleDto;
import kernel.mediator.RequestHandler;

public class GetAsientoDisponibleByKeyHandler
        implements RequestHandler<GetAsientoDisponibleByKeyQuery, AsientoDisponibleDto> {

    @Override
    public AsientoDisponibleDto handle(GetAsientoDisponibleByKeyQuery arg0) {
        System.out.println("Entro al handler");
        AsientoDisponibleDto asiento = new AsientoDisponibleDto();
        return asiento;
    }

}

package Application.UseCases.Queries.Tripulantes;

import Application.Dto.TripulanteDto;
import kernel.mediator.RequestHandler;

public class GetTripulanteByKeyHandler implements RequestHandler<GetTripulanteByKeyQuery, TripulanteDto>  {

    @Override
    public TripulanteDto handle(GetTripulanteByKeyQuery arg0) {
        System.out.println("Entro al handler");
        TripulanteDto tripulante = new TripulanteDto();
        return tripulante;
    
    }
    
}

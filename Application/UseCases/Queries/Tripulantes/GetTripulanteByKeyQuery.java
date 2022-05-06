package Application.UseCases.Queries.Tripulantes;

import java.util.UUID;

import Application.Dto.TripulanteDto;
import SharedKernel.mediator.Request;

public class GetTripulanteByKeyQuery implements Request<TripulanteDto> {
    
    public UUID Key;

    public GetTripulanteByKeyQuery(UUID key) {
        this.Key = key;
    }
    
}

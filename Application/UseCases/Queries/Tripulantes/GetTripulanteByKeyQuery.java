package Application.UseCases.Queries.Tripulantes;

import java.util.UUID;

import Application.Dto.TripulanteDto;
import kernel.mediator.Request;

public class GetTripulanteByKeyQuery implements Request<TripulanteDto> {
    
    public UUID Key;

    public GetTripulanteByKeyQuery() {
    }

    public GetTripulanteByKeyQuery(UUID key) {
        this.Key = key;
    }
    
}

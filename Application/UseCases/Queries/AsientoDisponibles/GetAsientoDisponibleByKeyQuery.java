package Application.UseCases.Queries.AsientoDisponibles;

import java.util.UUID;

import Application.Dto.AsientoDisponibleDto;
import kernel.mediator.Request;

public class GetAsientoDisponibleByKeyQuery implements Request<AsientoDisponibleDto> {
    
    public UUID Key;

    public GetAsientoDisponibleByKeyQuery() {
    }

    public GetAsientoDisponibleByKeyQuery(UUID key) {
        this.Key = key;
    }
    
}

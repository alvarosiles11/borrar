package UseCases.Queries.Tripulantes.GetByKey;

import Dto.VueloDto;
import fourteam.mediator.Request;
import java.util.UUID;

public class GetTripulanteByKeyQuery implements Request<VueloDto> {

  public UUID key;

  public GetTripulanteByKeyQuery(UUID key) {
    this.key = key;
  }
}

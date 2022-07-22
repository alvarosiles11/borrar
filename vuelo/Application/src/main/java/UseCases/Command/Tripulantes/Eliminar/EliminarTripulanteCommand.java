package UseCases.Command.Tripulantes.Eliminar;

import Dto.TripulanteDto;
import fourteam.mediator.Request;
import java.util.UUID;

public class EliminarTripulanteCommand implements Request<TripulanteDto> {

  TripulanteDto _TripulanteDto;

  public EliminarTripulanteCommand(UUID key) {
    this._TripulanteDto = new TripulanteDto();
    this._TripulanteDto.key = key;
  }
}

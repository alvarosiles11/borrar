package UseCases.Command.Tripulantes.Editar;

import Dto.TripulanteDto;
import fourteam.mediator.Request;
import java.util.UUID;

public class EditarTripulanteCommand implements Request<TripulanteDto> {

  public TripulanteDto _TripulanteDto;

  public EditarTripulanteCommand(UUID key) {
    this._TripulanteDto = new TripulanteDto();
    this._TripulanteDto.key = key;
  }
}

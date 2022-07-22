package UseCases.Command.Vuelos.Eliminar;

import Dto.VueloDto;
import fourteam.mediator.Request;
import java.util.UUID;

public class EliminarVueloCommand implements Request<VueloDto> {

  VueloDto _VueloDto;

  public EliminarVueloCommand(UUID key) {
    this._VueloDto = new VueloDto();
    this._VueloDto.key = key;
  }
}

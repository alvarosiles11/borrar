package UseCases.Command.Aeronaves.Editar;

import Dto.AeronaveDto;
import fourteam.mediator.Request;
import java.util.UUID;

public class EditarAeronaveCommand implements Request<AeronaveDto> {

  public AeronaveDto _AeronaveDto;

  public EditarAeronaveCommand(UUID keyAeronave) {
    this._AeronaveDto = new AeronaveDto();
    this._AeronaveDto.keyAeronave = keyAeronave;
  }
}

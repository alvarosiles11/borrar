package UseCases.Command.Aeronaves.Crear;

import Dto.AeronaveDto;
import fourteam.mediator.Request;

public class CrearAeronaveCommand implements Request<AeronaveDto> {

  public String matricula;

  public CrearAeronaveCommand(AeronaveDto vueloDto) {
    this.matricula = vueloDto.matricula;
  }
}

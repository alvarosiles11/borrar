package UseCases.Command.Tripulantes.Crear;

import Dto.TripulanteDto;
import fourteam.mediator.Request;
import java.util.UUID;

public class CrearTripulanteCommand implements Request<TripulanteDto> {

  public UUID keyVuelo; // vuelo
  public String keyTripulante; // tripulante
  public String cargo; // cargo

  public CrearTripulanteCommand(TripulanteDto tripulanteDto) {
    this.keyVuelo = tripulanteDto.keyVuelo;
    this.keyTripulante = tripulanteDto.keyTripulante;
    this.cargo = tripulanteDto.cargo;
  }
}

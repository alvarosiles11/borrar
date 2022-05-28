package UseCases.Command.Tripulantes.Editar;

import java.util.UUID;

import Dto.TripulanteDto;
import fourteam.mediator.Request;

public class EditarTripulanteCommand implements Request<TripulanteDto> {

    public TripulanteDto _TripulanteDto;

    public EditarTripulanteCommand(UUID keyVuelo) {
        this._TripulanteDto = new TripulanteDto();
        // this._TripulanteDto.keyVuelo = keyVuelo;
    }
}
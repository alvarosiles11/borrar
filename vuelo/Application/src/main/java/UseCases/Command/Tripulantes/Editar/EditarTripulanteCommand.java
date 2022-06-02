package UseCases.Command.Tripulantes.Editar;

import Dto.TripulanteDto;
import fourteam.mediator.Request;

public class EditarTripulanteCommand implements Request<TripulanteDto> {

    public TripulanteDto _TripulanteDto;

    public EditarTripulanteCommand(TripulanteDto tripulanteDto) {

        this._TripulanteDto = tripulanteDto;
        // this._TripulanteDto.keyVuelo = keyVuelo;
    }
}
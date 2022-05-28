package UseCases.Command.Vuelos.Editar;

import java.util.UUID;

import Dto.VueloDto;
import fourteam.mediator.Request;

public class EditarVueloCommand implements Request<VueloDto> {

    public VueloDto _VueloDto;

    public EditarVueloCommand(UUID key) {
        this._VueloDto = new VueloDto();
        this._VueloDto.key = key;
    }

}

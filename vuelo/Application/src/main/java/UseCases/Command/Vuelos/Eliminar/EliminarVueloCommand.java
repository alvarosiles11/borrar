package UseCases.Command.Vuelos.Eliminar;


import java.util.UUID;

import Dto.VueloDto;
import fourteam.mediator.Request;

public class EliminarVueloCommand implements Request<VueloDto> {

    VueloDto _VueloDto;

    public EliminarVueloCommand(UUID key) {
        this._VueloDto = new VueloDto();
        this._VueloDto.key = key;
    }
}
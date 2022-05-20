package Application.UseCases.Command.Vuelos.Eliminar;


import java.util.UUID;

import Application.Dto.VueloDto;
import SharedKernel.mediator.Request;

public class EliminarVueloCommand implements Request<VueloDto> {

    VueloDto _VueloDto;

    public EliminarVueloCommand(UUID key) {
        this._VueloDto = new VueloDto();
        this._VueloDto.key = key;
    }
}
package UseCases.Command.Aeronaves.Eliminar;

import java.util.UUID;

import Dto.AeronaveDto;
import fourteam.mediator.Request;

public class EliminarAeronaveCommand implements Request<AeronaveDto> {

    public AeronaveDto _AeronaveDto;

    public EliminarAeronaveCommand(UUID keyAeronave) {
        this._AeronaveDto = new AeronaveDto();
        this._AeronaveDto.keyAeronave = keyAeronave;
    }
}
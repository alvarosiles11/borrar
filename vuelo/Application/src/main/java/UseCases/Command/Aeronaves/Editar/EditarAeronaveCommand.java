package UseCases.Command.Aeronaves.Editar;

import java.util.UUID;

import Dto.AeronaveDto;
import fourteam.mediator.Request;

public class EditarAeronaveCommand implements Request<AeronaveDto> {

    public AeronaveDto _AeronaveDto;

    public EditarAeronaveCommand(UUID keyAeronave) {
        this._AeronaveDto = new AeronaveDto();
        this._AeronaveDto.keyAeronave = keyAeronave;
    }

}

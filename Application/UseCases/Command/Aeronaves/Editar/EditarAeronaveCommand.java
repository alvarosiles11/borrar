package Application.UseCases.Command.Aeronaves.Editar;

import java.util.UUID;

import Application.Dto.AeronaveDto;
import SharedKernel.mediator.Request;

public class EditarAeronaveCommand implements Request<AeronaveDto> {

    public AeronaveDto _AeronaveDto;

    public EditarAeronaveCommand(UUID key) {
        this._AeronaveDto = new AeronaveDto();
        this._AeronaveDto.keyAeronave = key;
    }

}

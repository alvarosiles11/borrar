package dmsnur.Application.UseCases.Command.Aeronaves.Editar;

import java.util.UUID;

import dmsnur.Application.Dto.AeronaveDto;
import dmsnur.SharedKernel.mediator.Request;

public class EditarAeronaveCommand implements Request<AeronaveDto> {

    public AeronaveDto _AeronaveDto;

    public EditarAeronaveCommand(UUID key) {
        this._AeronaveDto = new AeronaveDto();
        this._AeronaveDto.keyAeronave = key;
    }

}

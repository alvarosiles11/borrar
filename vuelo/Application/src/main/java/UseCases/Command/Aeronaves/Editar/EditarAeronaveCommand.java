package UseCases.Command.Aeronaves.Editar;

import Dto.AeronaveDto;
import fourteam.mediator.Request;

public class EditarAeronaveCommand implements Request<AeronaveDto> {

    public AeronaveDto _AeronaveDto;

    public EditarAeronaveCommand(AeronaveDto aeronaveDto) {
        this._AeronaveDto = aeronaveDto;
    }

}

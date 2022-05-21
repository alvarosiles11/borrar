package Application.UseCases.Command.Aeronaves.Crear;

import Application.Dto.AeronaveDto;
import SharedKernel.mediator.Request;

public class CrearAeronaveCommand implements Request<AeronaveDto> {

	public String matricula;

	public CrearAeronaveCommand(AeronaveDto vueloDto) {
		this.matricula = vueloDto.matricula;

	}

}
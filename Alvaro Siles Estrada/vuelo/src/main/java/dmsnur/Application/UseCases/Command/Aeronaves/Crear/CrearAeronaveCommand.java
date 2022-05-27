package dmsnur.Application.UseCases.Command.Aeronaves.Crear;

import dmsnur.Application.Dto.AeronaveDto;
import dmsnur.SharedKernel.mediator.Request;

public class CrearAeronaveCommand implements Request<AeronaveDto> {

	public String matricula;

	public CrearAeronaveCommand(AeronaveDto vueloDto) {
		this.matricula = vueloDto.matricula;

	}

}
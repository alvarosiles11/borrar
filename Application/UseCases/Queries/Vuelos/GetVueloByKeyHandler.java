package Application.UseCases.Queries.Vuelos;

import Application.Dto.VueloDto;
import kernel.mediator.RequestHandler;

public class GetVueloByKeyHandler implements RequestHandler<GetVueloByKeyQuery, VueloDto> {

	@Override
	public VueloDto handle(GetVueloByKeyQuery request) {
		VueloDto vuelo = new VueloDto();
		System.out.println("Entro al GetVueloByKeyHandler");
		return vuelo;
	}

}

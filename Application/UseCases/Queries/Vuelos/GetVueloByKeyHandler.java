package Application.UseCases.Queries.Vuelos;

import Application.Dto.VueloDto;
import kernel.mediator.RequestHandler;

public class GetVueloByKeyHandler implements RequestHandler<GetVueloByKeyQuery, VueloDto> {

	public GetVueloByKeyHandler() {
		System.out.println("Entro a GetVueloByKeyHandler");
	}

	@Override
	public VueloDto handle(GetVueloByKeyQuery request) {
		System.out.println("Entro al GetVueloByKeyHandler");
		return new VueloDto();
	}

}

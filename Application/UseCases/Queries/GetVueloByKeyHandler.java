package Application.UseCases.Queries;

import kernel.mediator.RequestHandler;
import Application.Dto.Vuelo.VueloDto;

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

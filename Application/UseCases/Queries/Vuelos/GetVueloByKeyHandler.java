package Application.UseCases.Queries.Vuelos;

import Application.Dto.VueloDto;
import Domain.Model.Vuelos.Vuelo;
import Domain.Repositories.IVueloRepository;
import SharedKernel.mediator.RequestHandler;

public class GetVueloByKeyHandler implements RequestHandler<GetVueloByKeyQuery, VueloDto> {

	private IVueloRepository _IVueloRepository;

	public GetVueloByKeyHandler(IVueloRepository iVueloRepository) {
		this._IVueloRepository = iVueloRepository;
	}

	@Override
	public VueloDto handle(GetVueloByKeyQuery request) {

		System.out.println(request.Key);
		Vuelo vuelo = _IVueloRepository.FindByKey(request.Key);

		if (vuelo == null) {
			return null;
		}

		VueloDto vueloDto = new VueloDto();
		vueloDto.nroVuelo = vuelo.nroVuelo;
		return vueloDto;
	}

}

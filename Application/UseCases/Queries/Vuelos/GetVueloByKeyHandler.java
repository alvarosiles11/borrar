package Application.UseCases.Queries.Vuelos;

import Application.Dto.TripulanteDto;
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

		//aqui muestrare los datos del vuelo
		vueloDto.nroVuelo = vuelo.nroVuelo;
		vueloDto.keyAeronave = vuelo.keyAeronave;
		vueloDto.keyAeropuertoOrigen = vuelo.keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = vuelo.keyAeropuertoDestino;
		vueloDto.fecha_salida = vuelo.fecha_salida;
		vueloDto.fecha_arribe = vuelo.fecha_arribe;
		vueloDto.listaTripulante = vuelo.listaTripulante;

		// vuelo.listaTripulante.iterator().forEachRemaining(obj -> {
        //     vueloDto.listaTripulante.add(new TripulanteDto(obj.key, obj.keyTripulante, obj.cargo));
        // });
		return vueloDto;

		
	}

}

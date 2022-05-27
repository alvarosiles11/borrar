package dmsnur.Application.UseCases.Queries.Vuelos.GetByKey;

import dmsnur.Application.Dto.TripulanteDto;
import dmsnur.Application.Dto.VueloDto;
import dmsnur.Domain.Model.Vuelos.Vuelo;
import dmsnur.Domain.Repositories.IVueloRepository;
import dmsnur.SharedKernel.http.HttpStatus;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

public class GetVueloByKeyHandler implements RequestHandler<GetVueloByKeyQuery, VueloDto> {

	private IVueloRepository _IVueloRepository;

	public GetVueloByKeyHandler(IVueloRepository iVueloRepository) {
		this._IVueloRepository = iVueloRepository;
	}

	@Override
	public VueloDto handle(GetVueloByKeyQuery request) throws HttpException {
		// obtengo el vuelo
		Vuelo vuelo = _IVueloRepository.FindByKey(request.Key);

		// verifico si no existe el vuelo
		if (vuelo == null) {
			// return null;
			throw new HttpException(HttpStatus.BAD_REQUEST, "Vuelo no encontrado");
		}

		// creo el dto
		VueloDto vueloDto = new VueloDto();

		// lleno el dto
		vueloDto.nroVuelo = vuelo.nroVuelo;
		vueloDto.keyAeronave = vuelo.keyAeronave;
		vueloDto.keyAeropuertoOrigen = vuelo.keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = vuelo.keyAeropuertoDestino;
		vueloDto.fecha_salida = vuelo.fecha_salida;
		vueloDto.fecha_arribe = vuelo.fecha_arribe;
		// vueloDto.listaTripulante = vuelo.listaTripulante;

		// retorno lista de tripulante el dto
		vuelo.listaTripulante.iterator().forEachRemaining(obj -> {
			vueloDto.listaTripulante.add(new TripulanteDto(obj.keyVuelo, obj.keyTripulante, obj.cargo));
		});
		return vueloDto;
	}
}
package dmsnur.UseCases.Command.Vuelos.Editar;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

import dmsnur.Application.Dto.VueloDto;
import dmsnur.Application.UseCases.Command.Vuelos.Editar.EditarVueloCommand;
import dmsnur.Application.UseCases.Command.Vuelos.Editar.EditarVueloHandler;
import dmsnur.Domain.Factories.IVueloFactory;
import dmsnur.Domain.Model.Vuelos.Vuelo;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.Domain.Repositories.IVueloRepository;
import dmsnur.SharedKernel.http.Exception.HttpException;

public class EditarVueloHandlerTest2 {
	IVueloFactory _iVueloFactory = Mockito.mock(IVueloFactory.class);
	IVueloRepository _iVueloRepository = Mockito.mock(IVueloRepository.class);
	IUnitOfWork _unitOfWork = Mockito.mock(IUnitOfWork.class);

	@Test
	public void HandleCorrectly() throws HttpException {

		String nroVuelo = "A123451";
		String keyAeronave = "xyz-19901";
		String keyAeropuertoOrigen = "aeropuerto1001";
		String keyAeropuertoDestino = "aeropuerto2001";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();

		Vuelo vuelo = new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe);

		when(_iVueloFactory.Create(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe)).thenReturn(vuelo);

		EditarVueloHandler editarVueloHandler = new EditarVueloHandler(_iVueloFactory, _iVueloRepository, _unitOfWork);
		// Vuelo _Vuelo = _iVueloRepository.FindByKey(vuelo.getKey());

		VueloDto vueloDto = new VueloDto();
		vueloDto.nroVuelo = nroVuelo;
		vueloDto.keyAeronave = keyAeronave;
		vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
		vueloDto.fecha_salida = fecha_salida;
		vueloDto.fecha_arribe = fecha_arribe;

		EditarVueloCommand editarVueloCommand = new EditarVueloCommand(vueloDto.key);
		Vuelo resp = editarVueloHandler.handle(editarVueloCommand);
		verify(_iVueloRepository).Update(resp);
	}
}

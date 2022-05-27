package dmsnur.Application.UseCases.Command.Vuelos.Crear;

import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

import dmsnur.Application.Dto.VueloDto;
import dmsnur.Domain.Factories.IVueloFactory;
import dmsnur.Domain.Model.Vuelos.Vuelo;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.Domain.Repositories.IVueloRepository;
import dmsnur.SharedKernel.http.Exception.HttpException;

public class CrearVueloHandlerTest {

	IVueloFactory iVueloFactory = Mockito.mock(IVueloFactory.class);
	IVueloRepository iVueloRepository = Mockito.mock(IVueloRepository.class);
	IUnitOfWork unitOfWork = Mockito.mock(IUnitOfWork.class);

	@Test
	public void HandleCorrectly() throws HttpException {

		String nroVuelo = "A12345";
		String keyAeronave = "xyz-1990";
		String keyAeropuertoOrigen = "aeropuerto100";
		String keyAeropuertoDestino = "aeropuerto200";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();

		Vuelo vuelo = new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe);

		when(iVueloFactory.Create(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe)).thenReturn(vuelo);

		CrearVueloHandler crearVueloHandler = new CrearVueloHandler(iVueloFactory, iVueloRepository, unitOfWork);

		VueloDto vueloDto = new VueloDto();
		vueloDto.nroVuelo = nroVuelo;
		vueloDto.keyAeronave = keyAeronave;
		vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
		vueloDto.fecha_salida = fecha_salida;
		vueloDto.fecha_arribe = fecha_arribe;

		CrearVueloCommand crearVueloCommand = new CrearVueloCommand(vueloDto);
		// Vuelo resp = crearVueloHandler.handle(crearVueloCommand);

	}
}
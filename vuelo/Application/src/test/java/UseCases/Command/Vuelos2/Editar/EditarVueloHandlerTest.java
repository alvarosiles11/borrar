package UseCases.Command.Vuelos2.Editar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Dto.VueloDto;
import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import UseCases.Command.Vuelos.Editar.EditarVueloCommand;
import UseCases.Command.Vuelos.Editar.EditarVueloHandler;
import fourteam.http.Exception.HttpException;

public class EditarVueloHandlerTest {
	IVueloFactory _IVueloFact = Mockito.mock(IVueloFactory.class);
	IVueloRepository _IVueloRep = Mockito.mock(IVueloRepository.class);
	IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

	@Before
	public void setUp() {
	}

	@Test
	public void HandleCorrectly() throws HttpException {

		UUID key = UUID.randomUUID();
		String nroVuelo = "A12345";
		String keyAeronave = "xyz-1990";
		String keyAeropuertoOrigen = "aeropuerto100";
		String keyAeropuertoDestino = "aeropuerto200";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();

		Vuelo vuelo = new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe);
		// Aeronave aeronave = new Aeronave(matricula);

		EditarVueloHandler handler = new EditarVueloHandler(_IVueloFact, _IVueloRep, _IUnitOfWork);

		VueloDto vueloDto = new VueloDto();
		vueloDto.key = key;
		vueloDto.nroVuelo = nroVuelo;
		vueloDto.keyAeronave = keyAeronave;
		vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
		vueloDto.fecha_salida = fecha_salida;
		when(_IVueloRep.FindByKey(any())).thenReturn(vuelo);
		// vueloDto.setNroVuelo(nroVuelo);
		// vueloDto.setKeyAeronave(keyAeronave);
		// vueloDto.setKeyAeropuertoOrigen(keyAeropuertoOrigen);
		// vueloDto.setKeyAeropuertoDestino(keyAeropuertoDestino);
		// vueloDto.setFecha_salida(fecha_salida);
		// vueloDto.setFecha_arribe(fecha_arribe);

		EditarVueloCommand command = new EditarVueloCommand(vueloDto);
		Vuelo resp = handler.handle(command);
		Assert.assertEquals(nroVuelo, resp.nroVuelo);
		// Assert.assertEquals(keyAeronave, resp.keyAeronave);
		// Assert.assertEquals(keyAeropuertoOrigen, resp.keyAeropuertoOrigen);
		// Assert.assertEquals(keyAeropuertoDestino, resp.keyAeropuertoDestino);
		// Assert.assertEquals(fecha_salida, resp.fecha_salida);
		// Assert.assertEquals(fecha_arribe, resp.fecha_arribe);
		// verify(_IVueloRep).FindByKey(key);
		verify(_IVueloRep).Update(resp);
	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(EditarVueloCommand.class.getConstructors()[0].canAccess(null));
	}
}
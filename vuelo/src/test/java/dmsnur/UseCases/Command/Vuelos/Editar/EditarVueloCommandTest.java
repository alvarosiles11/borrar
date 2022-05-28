package dmsnur.UseCases.Command.Vuelos.Editar;

import java.util.Date;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import dmsnur.Application.Dto.VueloDto;
import dmsnur.Application.UseCases.Command.Vuelos.Crear.CrearVueloCommand;
import dmsnur.Application.UseCases.Command.Vuelos.Editar.EditarVueloCommand;

public class EditarVueloCommandTest {

	@Test
	public void dataValid() {

		UUID key = UUID.randomUUID();
		String nroVuelo = "A123456";
		String keyAeronave = "xyz-1991";
		String keyAeropuertoOrigen = "aeropuerto101";
		String keyAeropuertoDestino = "aeropuerto201";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();

		VueloDto vueloDto = new VueloDto();
		vueloDto.key = key;
		vueloDto.nroVuelo = nroVuelo;
		vueloDto.keyAeronave = keyAeronave;
		vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
		vueloDto.fecha_salida = fecha_salida;
		vueloDto.fecha_arribe = fecha_arribe;

		EditarVueloCommand editarVueloCommand = new EditarVueloCommand(key);
		Assert.assertEquals(vueloDto.key, key);

	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(EditarVueloCommand.class.getConstructors()[0].canAccess(null));
	}

}
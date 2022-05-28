package dmsnur.UseCases.Command.Vuelos.Crear;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import dmsnur.Application.Dto.VueloDto;
 import dmsnur.Application.UseCases.Command.Vuelos.Crear.CrearVueloCommand;

public class CrearVueloCommandTest {

	@Test
	public void dataValid() {

		String nroVuelo = "A12345";
		String keyAeronave = "xyz-1990";
		String keyAeropuertoOrigen = "aeropuerto100";
		String keyAeropuertoDestino = "aeropuerto200";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();

		// VueloDto vueloDto = new VueloDto();
		// vueloDto.nroVuelo = nroVuelo;
		// vueloDto.keyAeronave = keyAeronave;
		// vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
		// vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
		// vueloDto.fecha_salida = fecha_salida;
		// vueloDto.fecha_arribe = fecha_arribe;
		VueloDto vueloDto = new VueloDto();
		vueloDto.setNroVuelo(nroVuelo);
		vueloDto.setKeyAeronave(keyAeronave);
		vueloDto.setKeyAeropuertoOrigen(keyAeropuertoOrigen);
		vueloDto.setKeyAeropuertoDestino(keyAeropuertoDestino);
		vueloDto.setFecha_salida(fecha_salida);
		vueloDto.setFecha_arribe(fecha_arribe);

		
		CrearVueloCommand crearVueloCommand = new CrearVueloCommand(vueloDto);
		Assert.assertEquals(nroVuelo, crearVueloCommand.nroVuelo);
		Assert.assertEquals(keyAeronave, crearVueloCommand.keyAeronave);
		Assert.assertEquals(keyAeropuertoOrigen, crearVueloCommand.keyAeropuertoOrigen);
		Assert.assertEquals(keyAeropuertoDestino, crearVueloCommand.keyAeropuertoDestino);
		Assert.assertEquals(fecha_salida, crearVueloCommand.fecha_salida);
		Assert.assertEquals(fecha_arribe, crearVueloCommand.fecha_arribe);
	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(CrearVueloCommand.class.getConstructors()[0].canAccess(null));
	}

}
package Dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

public class VueloDtoTest {

	@Test
	public void CheckPropertiesValid() {

		UUID key = UUID.randomUUID();
		String nroVuelo = "A12345";
		String keyAeronave = "xyz-1990";
		String keyAeropuertoOrigen = "aeropuerto100";
		String keyAeropuertoDestino = "aeropuerto200";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();
		List<TripulanteDto> listaTripulante = getTripulantes();

		// dto
		VueloDto vueloDto = new VueloDto();
		Assert.assertEquals(null, vueloDto.key);
		Assert.assertNull(vueloDto.nroVuelo);
		Assert.assertNull(vueloDto.keyAeronave);
		Assert.assertNull(vueloDto.keyAeropuertoOrigen);
		Assert.assertNull(vueloDto.keyAeropuertoDestino);
		Assert.assertNull(vueloDto.fecha_salida);
		Assert.assertNull(vueloDto.fecha_arribe);
		Assert.assertNotNull(vueloDto.listaTripulante);
		Assert.assertEquals(0, vueloDto.listaTripulante.size());
		// end dto

		// getters and setters
		vueloDto.key = key;
		vueloDto.setNroVuelo(nroVuelo);
		vueloDto.setKeyAeronave(keyAeronave);
		vueloDto.setKeyAeropuertoOrigen(keyAeropuertoOrigen);
		vueloDto.setKeyAeropuertoDestino(keyAeropuertoDestino);
		vueloDto.setFecha_salida(fecha_salida);
		vueloDto.setFecha_arribe(fecha_arribe);
		vueloDto.setListaTripulante(listaTripulante);

		Assert.assertEquals(key, vueloDto.key);
		Assert.assertEquals(nroVuelo, vueloDto.getNroVuelo());
		Assert.assertEquals(keyAeronave, vueloDto.getKeyAeronave());
		Assert.assertEquals(keyAeropuertoOrigen, vueloDto.getKeyAeropuertoOrigen());
		Assert.assertEquals(keyAeropuertoDestino, vueloDto.getKeyAeropuertoDestino());
		Assert.assertEquals(fecha_salida, vueloDto.getFecha_salida());
		Assert.assertEquals(fecha_arribe, vueloDto.getFecha_arribe());
		Assert.assertEquals(listaTripulante, vueloDto.getListaTripulante());
	}

	private List<TripulanteDto> getTripulantes() {
		return new ArrayList<>();
	}

}

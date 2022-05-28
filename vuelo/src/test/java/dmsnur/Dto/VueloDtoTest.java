package dmsnur.Dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import dmsnur.Application.Dto.TripulanteDto;
import dmsnur.Application.Dto.VueloDto;

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

		vueloDto.key = key;
		vueloDto.nroVuelo = nroVuelo;
		vueloDto.keyAeronave = keyAeronave;
		vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
		vueloDto.fecha_salida = fecha_salida;
		vueloDto.fecha_arribe = fecha_arribe;
		vueloDto.listaTripulante = listaTripulante;
		Assert.assertEquals(key, vueloDto.key);
		Assert.assertEquals(nroVuelo, vueloDto.nroVuelo);
		Assert.assertEquals(keyAeronave, vueloDto.keyAeronave);
		Assert.assertEquals(keyAeropuertoOrigen, vueloDto.keyAeropuertoOrigen);
		Assert.assertEquals(keyAeropuertoDestino, vueloDto.keyAeropuertoDestino);
		Assert.assertEquals(fecha_salida, vueloDto.fecha_salida);
		Assert.assertEquals(fecha_arribe, vueloDto.fecha_arribe);
		Assert.assertEquals(listaTripulante, vueloDto.listaTripulante);
	}

	private List<TripulanteDto> getTripulantes() {
		return new ArrayList<>();

	}

}

package Test.Application.Dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Application.Dto.TripulanteDto;
import Application.Dto.VueloDto;

public class VueloDto_Test {

	@Test
	public void CheckPropertiesValid() {

		UUID key = UUID.randomUUID();
		String nroVuelo = "A12345";
		String keyAeronave = "xyz-1990";
		String keyAeropuertoOrigen = "a111111111111111111111111";
		String keyAeropuertoDestino = "b11111111111111111111111";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();

		List<TripulanteDto> listaTripulante = getTripulantes();

		VueloDto vuelo = new VueloDto();

		Assert.assertEquals(null, vuelo.key);
		Assert.assertNull(vuelo.nroVuelo);
		Assert.assertNull(vuelo.keyAeronave);
		Assert.assertNull(vuelo.keyAeropuertoOrigen);
		Assert.assertNull(vuelo.keyAeropuertoDestino);
		Assert.assertNull(vuelo.fecha_salida);
		Assert.assertNull(vuelo.fecha_arribe);

		Assert.assertNotNull(vuelo.listaTripulante);
		Assert.assertEquals(0, vuelo.listaTripulante.size());

		vuelo.key = key;
		vuelo.nroVuelo = nroVuelo;
		vuelo.keyAeronave = keyAeronave;
		vuelo.keyAeropuertoOrigen = keyAeropuertoOrigen;
		vuelo.keyAeropuertoDestino = keyAeropuertoDestino;
		vuelo.fecha_salida = fecha_salida;
		vuelo.fecha_arribe = fecha_arribe;
		vuelo.listaTripulante = listaTripulante;

		Assert.assertEquals(key, vuelo.key);
		Assert.assertEquals(nroVuelo, vuelo.nroVuelo);
		Assert.assertEquals(keyAeronave, vuelo.keyAeronave);
		Assert.assertEquals(keyAeropuertoOrigen, vuelo.keyAeropuertoOrigen);
		Assert.assertEquals(keyAeropuertoDestino, vuelo.keyAeropuertoDestino);
		Assert.assertEquals(fecha_salida, vuelo.fecha_salida);
		Assert.assertEquals(fecha_arribe, vuelo.fecha_arribe);
		Assert.assertEquals(listaTripulante, vuelo.listaTripulante);
	}

	private List<TripulanteDto> getTripulantes() {
		return new ArrayList<>();
	}

}

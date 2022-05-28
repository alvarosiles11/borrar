package Dto;


import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import  Dto.TripulanteDto;

public class TripulanteDtoTest {

	@Test
	public void CheckPropertiesValid() {

		UUID key = UUID.randomUUID();
		UUID keyVuelo = UUID.randomUUID();
		String keyTripulante = "12345";
		String cargo = "Piloto";

		// dto
		TripulanteDto tripulanteDto = new TripulanteDto();
		Assert.assertEquals(null, tripulanteDto.key);
		Assert.assertEquals(null, tripulanteDto.keyVuelo);
		Assert.assertEquals(null, tripulanteDto.keyTripulante);
		Assert.assertEquals(null, tripulanteDto.cargo);
		// end dto

		// Constructor con parametros
		tripulanteDto = new TripulanteDto(keyVuelo, keyTripulante, cargo);

		// getters and setters
		tripulanteDto.key = key;
		tripulanteDto.setKeyVuelo(keyVuelo);
		tripulanteDto.setKeyTripulante(keyTripulante);
		tripulanteDto.setCargo(cargo);
		Assert.assertEquals(key, tripulanteDto.key);
		Assert.assertEquals(keyVuelo, tripulanteDto.getKeyVuelo());
		Assert.assertEquals(keyTripulante, tripulanteDto.getKeyTripulante());
		Assert.assertEquals(cargo, tripulanteDto.getCargo());
	}
}
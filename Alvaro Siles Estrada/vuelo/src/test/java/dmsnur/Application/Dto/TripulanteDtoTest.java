package dmsnur.Application.Dto;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

public class TripulanteDtoTest {

	@Test
	public void CheckPropertiesValid() {

		UUID key = UUID.randomUUID();
		UUID keyVuelo = UUID.randomUUID();
		String keyTripulante = "12345";
		String cargo = "Piloto";

		TripulanteDto tripulante = new TripulanteDto();

		Assert.assertEquals(null, tripulante.key);
		Assert.assertEquals(null, tripulante.keyVuelo);
		Assert.assertEquals(null, tripulante.keyTripulante);
		Assert.assertEquals(null, tripulante.cargo);

		tripulante.key = key;
		tripulante.keyVuelo = keyVuelo;
		tripulante.keyTripulante = keyTripulante;
		tripulante.cargo = cargo;

		Assert.assertEquals(key, tripulante.key);
		Assert.assertEquals(keyVuelo, tripulante.keyVuelo);
		Assert.assertEquals(keyTripulante, tripulante.keyTripulante);
		Assert.assertEquals(cargo, tripulante.cargo);

	}

}

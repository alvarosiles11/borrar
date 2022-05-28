package dmsnur.Dto;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import dmsnur.Application.Dto.TripulanteDto;

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

		tripulante.setKeyVuelo(keyVuelo);
		tripulante.setKeyTripulante(keyTripulante);
		tripulante.setCargo(cargo);

		Assert.assertEquals(key, tripulante.key);

		Assert.assertEquals(keyVuelo, tripulante.getKeyVuelo());
		Assert.assertEquals(keyTripulante, tripulante.getKeyTripulante());
		Assert.assertEquals(cargo, tripulante.getCargo());

	}

}

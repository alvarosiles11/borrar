package Model.Vuelos;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import core.Entity;

public class TripulanteTest extends Entity<UUID> {

	@Test
	public void CheckConstructor() {
		UUID keyVuelo = UUID.randomUUID();
		String keyTripulante = UUID.randomUUID().toString();
		String cargo = "Capitan";

		Tripulante tripulante = new Tripulante(keyVuelo, keyTripulante, cargo);
		Assert.assertEquals(keyVuelo, tripulante.keyVuelo);
		Assert.assertEquals(keyTripulante, tripulante.keyTripulante);
		Assert.assertEquals(cargo, tripulante.cargo);
	}

}
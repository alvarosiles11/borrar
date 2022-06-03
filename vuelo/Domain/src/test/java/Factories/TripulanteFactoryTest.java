package Factories;

import java.util.UUID;

import org.junit.Test;

import Model.Vuelos.Tripulante;

public class TripulanteFactoryTest {

	@Test
	public void dataValid() {
		TripulanteFactory tripulanteFactory = new TripulanteFactory();
		Tripulante tripulante = tripulanteFactory.Create(UUID.randomUUID(), UUID.randomUUID().toString(), "Piloto");
	}
}
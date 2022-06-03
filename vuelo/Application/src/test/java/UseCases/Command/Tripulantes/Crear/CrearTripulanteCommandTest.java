package UseCases.Command.Tripulantes.Crear;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.TripulanteDto;

public class CrearTripulanteCommandTest {

	@Test
	public void dataValid() {

		UUID keyVuelo = UUID.randomUUID();
		String keyTripulante = "12345";
		String cargo = "Piloto";

		TripulanteDto tripulante = new TripulanteDto();

		tripulante.setKeyVuelo(keyVuelo);
		tripulante.setKeyTripulante(keyTripulante);
		tripulante.setCargo(cargo);

		// CrearTripulanteCommand  command = new CrearTripulanteCommand(tripulante);
		// Assert.assertEquals(keyVuelo, command.keyVuelo);
		// Assert.assertEquals(keyTripulante, command.keyTripulante);
		// Assert.assertEquals(cargo, command.cargo);
 
	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(CrearTripulanteCommand.class.getConstructors()[0].canAccess(null));
	}

}
package UseCases.Command.Tripulantes.Eliminar;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.TripulanteDto;

public class EliminarTripulanteCommandTest {

	@Test
	public void dataValid() {

		UUID keyVuelo = UUID.randomUUID();

		TripulanteDto tripulanteDto = new TripulanteDto();
		tripulanteDto.setKeyVuelo(keyVuelo);

		EliminarTripulanteCommand command = new EliminarTripulanteCommand(tripulanteDto.keyVuelo);
		Assert.assertEquals(keyVuelo, tripulanteDto.keyVuelo);
	}
}
package UseCases.Command.Tripulantes.Editar;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.TripulanteDto;

public class EditarTripulanteCommandTest {

	@Test
	public void dataValid() {

		UUID keyVuelo = UUID.randomUUID();
		String keyTripulante = "12345";
		String cargo = "Piloto";

		TripulanteDto tripulanteDto = new TripulanteDto();
		tripulanteDto.setKeyVuelo(keyVuelo);
		tripulanteDto.setKeyTripulante(keyTripulante);
		tripulanteDto.setCargo(cargo);

		EditarTripulanteCommand command = new EditarTripulanteCommand(tripulanteDto);
		Assert.assertEquals(keyVuelo, tripulanteDto.keyVuelo);
	}
}
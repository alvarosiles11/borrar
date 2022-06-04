package Controllers;

import static org.mockito.ArgumentMatchers.any;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Factories.ITripulanteFactory;
import Repositories.ITripulanteRepository;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.Mediator;

public class TripulanteControllerTest {

	ITripulanteFactory tripulanteFactory = Mockito.mock(ITripulanteFactory.class);
	ITripulanteRepository tripulanteRepository = Mockito.mock(ITripulanteRepository.class);

	@Before
	public void setup() {

	}

	@Test
	public void HandleTripulanteController_Ok() throws HttpException {

		UUID key = UUID.randomUUID();

		UUID keyVuelo = UUID.randomUUID();
		String keyTripulante = UUID.randomUUID().toString();
		String cargo = "Piloto";

		TripulanteController tripulanteController = new TripulanteController(any(Mediator.class));
		// fourteam.mediator.Response<Tripulante> response =
		// tripulanteController.register(any(UseCases.Command.Tripulantes.Crear.CrearTripulanteCommand.class));

	}
}

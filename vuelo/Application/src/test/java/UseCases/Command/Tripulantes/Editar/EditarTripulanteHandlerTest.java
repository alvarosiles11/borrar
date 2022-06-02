package UseCases.Command.Tripulantes.Editar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Dto.TripulanteDto;
import Factories.ITripulanteFactory;
import Model.Vuelos.Tripulante;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;

public class EditarTripulanteHandlerTest {
	ITripulanteFactory _ITripFact = Mockito.mock(ITripulanteFactory.class);
	ITripulanteRepository _ITripRep = Mockito.mock(ITripulanteRepository.class);
	IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

	@Before
	public void setUp() {
	}

	@Test
	public void HandleCorrectly() throws HttpException {

		UUID keyVuelo = UUID.randomUUID();
		String keyTripulante = "12345";
		String cargo = "Piloto";
		Tripulante tripulante = new Tripulante(keyVuelo, keyTripulante, cargo);

		EditarTripulanteHandler handler = new EditarTripulanteHandler(_ITripFact, _ITripRep, _IUnitOfWork);

		TripulanteDto tripulanteDto = new TripulanteDto();
		// tripulanteDto.setKeyVuelo(keyVuelo);
		// tripulanteDto.setKeyTripulante(keyTripulante);
		// tripulanteDto.setCargo(cargo);
		tripulanteDto.keyVuelo = keyVuelo;
		tripulanteDto.keyTripulante = keyTripulante;
		tripulanteDto.cargo = cargo;
		when(_ITripRep.FindByKey(any())).thenReturn(tripulante);

		EditarTripulanteCommand command = new EditarTripulanteCommand(tripulanteDto);
		Tripulante resp = handler.handle(command);

		Assert.assertEquals(keyVuelo, tripulanteDto.keyVuelo);
		Assert.assertEquals(keyTripulante, tripulanteDto.keyTripulante);
		Assert.assertEquals(cargo, tripulanteDto.cargo);
		verify(_ITripRep).Update(resp);
	}
}
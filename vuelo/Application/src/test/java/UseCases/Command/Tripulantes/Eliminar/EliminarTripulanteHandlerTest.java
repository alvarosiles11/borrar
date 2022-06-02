package UseCases.Command.Tripulantes.Eliminar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Factories.IAeronaveFactory;
import Factories.ITripulanteFactory;
import Model.Aeronaves.Aeronave;
import Model.Vuelos.Tripulante;
import Repositories.IAeronaveRepository;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;

public class EliminarTripulanteHandlerTest {
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

		EliminarTripulanteHandler handler = new EliminarTripulanteHandler(_ITripFact, _ITripRep, _IUnitOfWork);
		when(_ITripRep.FindByKey(any())).thenReturn(tripulante);

	}
}

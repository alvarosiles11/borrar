package UseCases.Command.Aeronaves.Eliminar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Factories.IAeronaveFactory;
import Model.Aeronaves.Aeronave;
import Repositories.IAeronaveRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;

public class EliminarAeronaveHandlerTest {
	IAeronaveFactory _IAeroFact = Mockito.mock(IAeronaveFactory.class);
	IAeronaveRepository _IAeroRep = Mockito.mock(IAeronaveRepository.class);
	IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

	@Before
	public void setUp() {
	}

	@Test
	public void HandleCorrectly() throws HttpException {

		String matricula = "xyz-1990";

		Aeronave aeronave = new Aeronave(matricula);
		EliminarAeronaveHandler handler = new EliminarAeronaveHandler(_IAeroFact, _IAeroRep, _IUnitOfWork);
		when(_IAeroRep.FindByKey(any())).thenReturn(aeronave);

	}
}

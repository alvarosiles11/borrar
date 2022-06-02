package UseCases.Command.Aeronaves.Editar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Dto.AeronaveDto;
import Factories.IAeronaveFactory;
import Model.Aeronaves.Aeronave;
import Repositories.IAeronaveRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;

public class EditarAeronaveHandlerTest {
	IAeronaveFactory _IAeroFact = Mockito.mock(IAeronaveFactory.class);
	IAeronaveRepository _IAeroRep = Mockito.mock(IAeronaveRepository.class);
	IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

	@Before
	public void setUp() {
	}

	@Test
	public void HandleCorrectly() throws HttpException {

		UUID keyAeronave = UUID.randomUUID();
		String matricula = "xyz-1990";

		Aeronave aeronave = new Aeronave(matricula);

		EditarAeronaveHandler handler = new EditarAeronaveHandler(_IAeroFact, _IAeroRep, _IUnitOfWork);

		AeronaveDto aeronaveDto = new AeronaveDto();
		aeronaveDto.keyAeronave = keyAeronave;
		aeronaveDto.matricula = matricula;
		when(_IAeroRep.FindByKey(any())).thenReturn(aeronave);

		EditarAeronaveCommand command = new EditarAeronaveCommand(aeronaveDto);
		Aeronave resp = handler.handle(command);
		// Assert.assertEquals(keyAeronave, resp.key);
		// Assert.assertEquals(matricula, resp.matricula);
		verify(_IAeroRep).Update(resp);
	}
}
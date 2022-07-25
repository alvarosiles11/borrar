package UseCases.Command.Aeronaves.Editar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import Dto.AeronaveDto;
import Factories.IAeronaveFactory;
import Model.Aeronaves.Aeronave;
import Repositories.IAeronaveRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class EditarAeronaveHandlerTest {

  IAeronaveFactory _IAeroFact = Mockito.mock(IAeronaveFactory.class);
  IAeronaveRepository _IAeroRep = Mockito.mock(IAeronaveRepository.class);
  IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

  @Before
  public void setUp() {}

  @Test
  public void HandleCorrectly() throws HttpException {
    UUID keyAeronave = UUID.randomUUID();
    String matricula = "xyz-1990";

    Aeronave aeronave = new Aeronave(matricula);
    when(_IAeroRep.FindByKey(any())).thenReturn(aeronave);

    EditarAeronaveHandler handler = new EditarAeronaveHandler(
      _IAeroFact,
      _IAeroRep,
      _IUnitOfWork
    );

    AeronaveDto aeronaveDto = new AeronaveDto();
    aeronaveDto.keyAeronave = keyAeronave;
    aeronaveDto.matricula = matricula;

    EditarAeronaveCommand command = new EditarAeronaveCommand(
      aeronaveDto.keyAeronave
    );
    command._AeronaveDto.keyAeronave = keyAeronave;
    command._AeronaveDto.matricula = matricula;
    Aeronave resp = handler.handle(command);
    Assert.assertEquals(keyAeronave, aeronaveDto.keyAeronave);
    System.out.println(resp);
  }

  @Test
  public void HandleFailed() throws HttpException {
    when(_IAeroRep.FindByKey(any())).thenReturn(null);
    EditarAeronaveHandler handler = new EditarAeronaveHandler(
      _IAeroFact,
      _IAeroRep,
      _IUnitOfWork
    );
    AeronaveDto aeronaveDto = new AeronaveDto();
    aeronaveDto.keyAeronave = UUID.randomUUID();
    aeronaveDto.matricula = "ABC";

    EditarAeronaveCommand command = new EditarAeronaveCommand(
      aeronaveDto.keyAeronave
    );
    try {
      Aeronave resp = handler.handle(command);
      System.out.println(resp);
    } catch (HttpException e) {
      Assert.assertEquals(400, e.getCode());
    }
  }
}

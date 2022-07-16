package UseCases.Command.Tripulantes.Editar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import Dto.TripulanteDto;
import Factories.ITripulanteFactory;
import Model.Vuelos.Tripulante;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class EditarTripulanteHandlerTest {

  ITripulanteFactory _ITripFact = Mockito.mock(ITripulanteFactory.class);
  ITripulanteRepository _ITripRep = Mockito.mock(ITripulanteRepository.class);
  IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

  @Before
  public void setUp() {}

  @Test
  public void HandleCorrectly() throws HttpException {
    UUID key = UUID.randomUUID();
    UUID keyVuelo = UUID.randomUUID();
    String keyTripulante = "12345";
    String cargo = "Piloto";

    Tripulante tripulante = new Tripulante(keyVuelo, keyTripulante, cargo);
    when(_ITripRep.FindByKey(any())).thenReturn(tripulante);

    EditarTripulanteHandler handler = new EditarTripulanteHandler(
      _ITripFact,
      _ITripRep,
      _IUnitOfWork
    );

    TripulanteDto tripulanteDto = new TripulanteDto();
    tripulanteDto.key = key;
    tripulanteDto.keyVuelo = keyVuelo;
    tripulanteDto.keyTripulante = keyTripulante;
    tripulanteDto.cargo = cargo;

    EditarTripulanteCommand command = new EditarTripulanteCommand(
      tripulanteDto.key
    );
    command._TripulanteDto.keyVuelo = keyVuelo;
    command._TripulanteDto.keyTripulante = keyTripulante;
    command._TripulanteDto.cargo = cargo;
    Tripulante resp = handler.handle(command);
  }

  @Test
  public void HandleFailed() throws HttpException {
    when(_ITripRep.FindByKey(any())).thenReturn(null);

    EditarTripulanteHandler handler = new EditarTripulanteHandler(
      _ITripFact,
      _ITripRep,
      _IUnitOfWork
    );

    TripulanteDto tripulanteDto = new TripulanteDto();
    tripulanteDto.key = UUID.randomUUID();

    tripulanteDto.keyVuelo = UUID.randomUUID();
    tripulanteDto.keyTripulante = "12345";
    tripulanteDto.cargo = "Piloto";

    EditarTripulanteCommand command = new EditarTripulanteCommand(
      tripulanteDto.key
    );

    try {
      Tripulante resp = handler.handle(command);
    } catch (HttpException e) {
      Assert.assertEquals(400, e.getCode());
    }
  }
}

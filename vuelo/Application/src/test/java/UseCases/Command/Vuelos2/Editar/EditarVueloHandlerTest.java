package UseCases.Command.Vuelos2.Editar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import Dto.VueloDto;
import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import UseCases.Command.Vuelos.Editar.EditarVueloCommand;
import UseCases.Command.Vuelos.Editar.EditarVueloHandler;
import fourteam.http.Exception.HttpException;
import java.util.Date;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class EditarVueloHandlerTest {

  IVueloFactory _IVueloFact = Mockito.mock(IVueloFactory.class);
  IVueloRepository _IVueloRep = Mockito.mock(IVueloRepository.class);
  IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

  @Before
  public void setUp() {}

  @Test
  public void HandleCorrectly() throws HttpException {
    UUID key = UUID.randomUUID();
    String nroVuelo = "A12345";
    String keyAeronave = "xyz-1990";
    String keyAeropuertoOrigen = "aeropuerto100";
    String keyAeropuertoDestino = "aeropuerto200";
    Date fecha_salida = new Date();
    Date fecha_arribe = new Date();

    Vuelo vuelo = new Vuelo(
      nroVuelo,
      keyAeronave,
      keyAeropuertoOrigen,
      keyAeropuertoDestino,
      fecha_salida,
      fecha_arribe
    );
    when(_IVueloRep.FindByKey(any())).thenReturn(vuelo);

    EditarVueloHandler handler = new EditarVueloHandler(
      _IVueloFact,
      _IVueloRep,
      _IUnitOfWork
    );

    VueloDto vueloDto = new VueloDto();
    vueloDto.key = key;
    vueloDto.nroVuelo = nroVuelo;
    vueloDto.keyAeronave = keyAeronave;
    vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
    vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
    vueloDto.fecha_salida = fecha_salida;
    vueloDto.fecha_arribe = fecha_arribe;

    EditarVueloCommand command = new EditarVueloCommand(vueloDto.key);

    command._VueloDto.key = key;
    command._VueloDto.nroVuelo = nroVuelo;
    command._VueloDto.keyAeronave = keyAeronave;
    command._VueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
    command._VueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
    command._VueloDto.fecha_salida = fecha_salida;
    command._VueloDto.fecha_arribe = fecha_arribe;

    Vuelo resp = handler.handle(command);
    Assert.assertEquals(nroVuelo, resp.nroVuelo);
  }

  @Test
  public void HandleFailed() throws HttpException {
    when(_IVueloRep.FindByKey(any())).thenReturn(null);
    EditarVueloHandler handler = new EditarVueloHandler(
      _IVueloFact,
      _IVueloRep,
      _IUnitOfWork
    );
    VueloDto vueloDto = new VueloDto();
    vueloDto.nroVuelo = "A12345";
    vueloDto.keyAeronave = "xyz-1990";
    vueloDto.keyAeropuertoOrigen = "aeropuerto100";
    vueloDto.keyAeropuertoDestino = "aeropuerto200";
    vueloDto.fecha_salida = new Date();
    vueloDto.fecha_arribe = new Date();

    EditarVueloCommand command = new EditarVueloCommand(vueloDto.key);
    try {
      Vuelo resp = handler.handle(command);
    } catch (HttpException e) {
      Assert.assertEquals(400, e.getCode());
    }
  }
}

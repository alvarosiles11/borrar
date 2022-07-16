package UseCases.Command.Vuelos2.Crear;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import Dto.VueloDto;
import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import UseCases.Command.Vuelos.Crear.CrearVueloCommand;
import UseCases.Command.Vuelos.Crear.CrearVueloHandler;
import fourteam.http.Exception.HttpException;
import java.util.Date;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CrearVueloHandlerTest {

  IVueloFactory _IVueloFactory = Mockito.mock(IVueloFactory.class);
  IVueloRepository _IVueloRepository = Mockito.mock(IVueloRepository.class);
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
    when(
      _IVueloFactory.Create(
        nroVuelo,
        keyAeronave,
        keyAeropuertoOrigen,
        keyAeropuertoDestino,
        fecha_salida,
        fecha_arribe
      )
    )
      .thenReturn(vuelo);

    CrearVueloHandler handler = new CrearVueloHandler(
      _IVueloFactory,
      _IVueloRepository,
      _IUnitOfWork
    );
    VueloDto vueloDto = new VueloDto();
    vueloDto.nroVuelo = nroVuelo;
    vueloDto.keyAeronave = keyAeronave;
    vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
    vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
    vueloDto.fecha_salida = fecha_salida;
    vueloDto.fecha_arribe = fecha_arribe;

    CrearVueloCommand command = new CrearVueloCommand(vueloDto);
    Vuelo response = handler.handle(command);
    verify(_IVueloRepository).Create(response);
    verify(_IUnitOfWork).commit();
    Assert.assertEquals(nroVuelo, response.nroVuelo);
    Assert.assertEquals(keyAeronave, response.keyAeronave);
    Assert.assertEquals(keyAeropuertoOrigen, response.keyAeropuertoOrigen);
    Assert.assertEquals(keyAeropuertoDestino, response.keyAeropuertoDestino);
    Assert.assertEquals(fecha_salida, response.fecha_salida);
    Assert.assertEquals(fecha_arribe, response.fecha_arribe);
  }
}

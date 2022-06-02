package UseCases.Queries.Vuelos.GetByKey;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import Dto.TripulanteDto;
import Dto.VueloDto;
import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import UseCases.Command.Vuelos.Crear.CrearVueloCommand;
import UseCases.Command.Vuelos.Crear.CrearVueloHandler;
import fourteam.http.Exception.HttpException;

public class GetVueloByKeyHandlerTest {

    IVueloFactory _IVueloFactory = Mockito.mock(IVueloFactory.class);
    IVueloRepository _IVueloRepository = Mockito.mock(IVueloRepository.class);
    IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

    // GetVueloByKeyHandler handler = new GetVueloByKeyHandler(_IVueloRepository);

    @Test
    public void HandleCorrectly() throws HttpException {

        UUID key = UUID.randomUUID();
        String nroVuelo = "A12345";
        String keyAeronave = "xyz-1990";
        String keyAeropuertoOrigen = "aeropuerto100";
        String keyAeropuertoDestino = "aeropuerto200";
        Date fecha_salida = new Date();
        Date fecha_arribe = new Date();

        VueloDto vueloDto = new VueloDto();
        vueloDto.key = key;
        vueloDto.setNroVuelo(nroVuelo);
        vueloDto.setKeyAeronave(keyAeronave);
        vueloDto.setKeyAeropuertoOrigen(keyAeropuertoOrigen);
        vueloDto.setKeyAeropuertoDestino(keyAeropuertoDestino);
        vueloDto.setFecha_salida(fecha_salida);
        vueloDto.setFecha_arribe(fecha_arribe);

        Vuelo vuelo = new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
                fecha_arribe);

        CrearVueloCommand command = new CrearVueloCommand(vueloDto);
        when(_IVueloFactory.Create(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
                fecha_arribe)).thenReturn(vuelo);

        CrearVueloHandler handler = new CrearVueloHandler(_IVueloFactory, _IVueloRepository, _IUnitOfWork);
        Vuelo respuesta = handler.handle(command);

        verify(_IVueloRepository).Create(respuesta);
        verify(_IUnitOfWork).commit();

        // Assert.assertEquals(PersonalRegistrado.class,
        // respuesta.domainEvents.get(0).getClass());
        Assert.assertEquals(nroVuelo, respuesta.nroVuelo);
        Assert.assertEquals(keyAeronave, respuesta.keyAeronave);
        Assert.assertEquals(keyAeropuertoOrigen, respuesta.keyAeropuertoOrigen);
        Assert.assertEquals(keyAeropuertoDestino, respuesta.keyAeropuertoDestino);
        Assert.assertEquals(fecha_salida, respuesta.fecha_salida);
        Assert.assertEquals(fecha_arribe, respuesta.fecha_arribe);

        GetVueloByKeyQuery commandGetKey = new GetVueloByKeyQuery(vueloDto.key);
        // when(_IVueloRepository.FindByKey(any())).thenReturn(vuelo);
        when(_IVueloRepository.FindByKey(commandGetKey.Key)).thenReturn(vuelo);
        GetVueloByKeyHandler handlerGetKey = new GetVueloByKeyHandler(_IVueloRepository);
        VueloDto respuestaGetKey = handlerGetKey.handle(commandGetKey);

        vuelo.listaTripulante.iterator().forEachRemaining(obj -> {
            vueloDto.listaTripulante.add(new TripulanteDto(UUID.randomUUID(), any(), any()));
        });

    }
}

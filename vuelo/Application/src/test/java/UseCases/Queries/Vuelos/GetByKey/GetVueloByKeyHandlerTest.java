package UseCases.Queries.Vuelos.GetByKey;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.mockito.Mockito;

import Dto.TripulanteDto;
import Dto.VueloDto;
import Model.Vuelos.Vuelo;
import Repositories.IVueloRepository;
import fourteam.http.Exception.HttpException;

public class GetVueloByKeyHandlerTest {

    IVueloRepository _IVueloRepository = Mockito.mock(IVueloRepository.class);

    GetVueloByKeyHandler handler = new GetVueloByKeyHandler(_IVueloRepository);

    @Test
    public void HandleCorrectly() throws HttpException {

        UUID key = UUID.randomUUID();
        String nroVuelo = "A12345";
        String keyAeronave = "xyz-1990";
        String keyAeropuertoOrigen = "aeropuerto100";
        String keyAeropuertoDestino = "aeropuerto200";
        Date fecha_salida = new Date();
        Date fecha_arribe = new Date();
        Vuelo vuelo = new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
                fecha_arribe);
        when(_IVueloRepository.FindByKey(any())).thenReturn(vuelo);

        VueloDto vueloDto = new VueloDto();
        vueloDto.key = key;
        vueloDto.nroVuelo = nroVuelo;
        vueloDto.keyAeronave = keyAeronave;
        vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
        vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
        vueloDto.fecha_salida = fecha_salida;
        vueloDto.fecha_arribe = fecha_arribe;

        vuelo.listaTripulante.iterator().forEachRemaining(obj -> {
            vueloDto.listaTripulante.add(new TripulanteDto(obj.keyVuelo, obj.keyTripulante, obj.cargo));
        });

    }
}

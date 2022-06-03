package UseCases.Queries.Tripulantes.GetByKey;

import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.Test;
import org.mockito.Mockito;

import Dto.TripulanteDto;
import Model.Vuelos.Tripulante;
import Repositories.ITripulanteRepository;
import fourteam.http.Exception.HttpException;

public class GetTripulanteByKeyHandlerTest {

    ITripulanteRepository _ITripulanteRepository = Mockito.mock(ITripulanteRepository.class);

    GetTripulanteByKeyHandler handler = new GetTripulanteByKeyHandler(_ITripulanteRepository);

    @Test
    public void HandleCorrectly() throws HttpException {

        UUID keyVuelo = UUID.randomUUID();
        String keyTripulante = "12345";
        String cargo = "Piloto";

        Tripulante tripulante = new Tripulante(keyVuelo, keyTripulante, cargo);
        when(_ITripulanteRepository.FindByKey(keyVuelo)).thenReturn(tripulante);

        TripulanteDto tripulanteDto = new TripulanteDto();
        tripulanteDto.keyTripulante = keyTripulante;
        tripulanteDto.cargo = cargo;
        tripulanteDto.keyVuelo = keyVuelo;

    }
}

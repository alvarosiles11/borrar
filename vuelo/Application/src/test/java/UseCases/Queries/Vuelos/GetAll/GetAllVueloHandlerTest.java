package UseCases.Queries.Vuelos.GetAll;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Model.Vuelos.Vuelo;
import Repositories.IVueloRepository;

public class GetAllVueloHandlerTest {

    IVueloRepository _IVueloRepository = Mockito.mock(IVueloRepository.class);

    @Test
    public void dataValid() {

        GetAllVueloHandler handler = new GetAllVueloHandler(_IVueloRepository);
        GetAllVueloQuery query = new GetAllVueloQuery();
        List<Vuelo> listaVuelos = handler.handle(query);
    }

}

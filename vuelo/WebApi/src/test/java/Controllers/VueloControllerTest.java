package Controllers;

import static org.mockito.ArgumentMatchers.any;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Factories.IVueloFactory;
import Repositories.IVueloRepository;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.Mediator;

public class VueloControllerTest {

    // IVueloFactory vueloFactory = Mockito.mock(IVueloFactory.class);
    // IVueloRepository vueloRepository = Mockito.mock(IVueloRepository.class);

    @Before
    public void setup() {
    }

    @Test
    public void HandleVueloController_Ok() throws HttpException {

        UUID key = UUID.randomUUID();
        String nroVuelo = "A12345";
        String keyAeronave = "xyz-1990";
        String keyAeropuertoOrigen = "aeropuerto100";
        String keyAeropuertoDestino = "aeropuerto200";
        Date fecha_salida = new Date();
        Date fecha_arribe = new Date();

        VueloController vueloController = new VueloController(any(Mediator.class));
        // fourteam.mediator.Response<Tripulante> response =
        // vueloController.register(any(UseCases.Command.Vuelos.Crear.CrearVueloCommand.class));
    }

}
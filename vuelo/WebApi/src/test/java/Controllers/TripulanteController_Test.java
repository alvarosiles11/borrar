// package Controllers;

// import static org.mockito.ArgumentMatchers.any;

// import java.util.List;
// import java.util.UUID;
// import org.junit.Before;
// import org.junit.Test;
// import org.mockito.Mockito;

// import Context.IWriteDbContext;
// import Context.MongoDB.WriteDbContext;
// import Event.PersonalRegistrado;
// import Factories.ITripulanteFactory;
// import Model.Tripulante.Cargo;
// import Model.Tripulante.Tripulante;
// import Repositories.ITripulanteRepository;
// import Repository.TripulanteRepository;
// import UsesCases.Command.Tripulante.Crear.CrearTripulanteCommand;
// import fourteam.db.DbContext;
// import fourteam.http.Response;
// import fourteam.http.Exception.HttpException;
// import fourteam.http.annotation.RequestBody;
// import fourteam.mediator.Mediator;

// public class TripulanteController_Test {

// ITripulanteFactory tripulanteFactory =
// Mockito.mock(ITripulanteFactory.class);
// ITripulanteRepository tripulanteRepository =
// Mockito.mock(ITripulanteRepository.class);

// @Before
// public void setup() {

// }

// @Test
// public void HandleTripulanteController_Ok() throws HttpException {
// // creando tripulante
// UUID keyTest = UUID.randomUUID();
// String nombreTest = "Jose";
// String apellidoTest = "Perez";
// String emailAddressTest = "jose@gmail.com";
// // Cargo cargoTest = "Piloto";
// Cargo cargoTest = new Cargo(2500.0, "asistente");

// TripulanteController tripulanteController = new
// TripulanteController(any(Mediator.class));
// //fourteam.mediator.Response<Tripulante> response =
// tripulanteController.register( any(CrearTripulanteCommand.class));

// }
// }

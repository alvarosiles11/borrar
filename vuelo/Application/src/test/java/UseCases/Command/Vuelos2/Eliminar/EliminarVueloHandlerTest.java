package UseCases.Command.Vuelos2.Eliminar;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Factories.IAeronaveFactory;
import Factories.IVueloFactory;
import Model.Aeronaves.Aeronave;
import Model.Vuelos.Vuelo;
import Repositories.IAeronaveRepository;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import UseCases.Command.Vuelos.Eliminar.EliminarVueloHandler;
import fourteam.http.Exception.HttpException;

public class EliminarVueloHandlerTest {
	IVueloFactory _IVueloFact = Mockito.mock(IVueloFactory.class);
	IVueloRepository _IVueloRep = Mockito.mock(IVueloRepository.class);
	IUnitOfWork _IUnitOfWork = Mockito.mock(IUnitOfWork.class);

	@Before
	public void setUp() {
	}

	@Test
	public void HandleCorrectly() throws HttpException {
		Vuelo vuelo = new Vuelo("A12345", "xyz-1990", "aeropuerto100", "aeropuerto200", new Date(), new Date());
		EliminarVueloHandler handler = new EliminarVueloHandler(_IVueloFact, _IVueloRep, _IUnitOfWork);
		when(_IVueloRep.FindByKey(any())).thenReturn(vuelo);
		// when(_IVueloRep.Delete(any())).thenReturn(vuelo);
	}
}

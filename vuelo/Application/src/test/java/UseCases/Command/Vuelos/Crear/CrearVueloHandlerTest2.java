package  UseCases.Command.Vuelos.Crear;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import Dto.VueloDto;
import UseCases.Command.Vuelos.Crear.CrearVueloCommand;
import UseCases.Command.Vuelos.Crear.CrearVueloHandler;
import Event.VueloCreado;
import Factories.IVueloFactory;
import Model.Vuelos.Vuelo;
import Repositories.IUnitOfWork;
import Repositories.IVueloRepository;
import fourteam.http.Exception.HttpException;

public class CrearVueloHandlerTest2 {
    IVueloFactory _iVueloFactory = Mockito.mock(IVueloFactory.class);
	IVueloRepository _iVueloRepository = Mockito.mock(IVueloRepository.class);
	IUnitOfWork _unitOfWork = Mockito.mock(IUnitOfWork.class);

    @Test
	public void HandleCorrectly() throws HttpException {

		String nroVuelo = "A12345";
		String keyAeronave = "xyz-1990";
		String keyAeropuertoOrigen = "aeropuerto100";
		String keyAeropuertoDestino = "aeropuerto200";
		Date fecha_salida = new Date();
		Date fecha_arribe = new Date();

		Vuelo vuelo = new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe);

		when(_iVueloFactory.Create(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe)).thenReturn(vuelo);

		CrearVueloHandler crearVueloHandler = new CrearVueloHandler(_iVueloFactory, _iVueloRepository, _unitOfWork);

		VueloDto vueloDto = new VueloDto();
		vueloDto.nroVuelo = nroVuelo;
		vueloDto.keyAeronave = keyAeronave;
		vueloDto.keyAeropuertoOrigen = keyAeropuertoOrigen;
		vueloDto.keyAeropuertoDestino = keyAeropuertoDestino;
		vueloDto.fecha_salida = fecha_salida;
		vueloDto.fecha_arribe = fecha_arribe;

		CrearVueloCommand crearVueloCommand = new CrearVueloCommand(vueloDto);
		Vuelo resp = crearVueloHandler.handle(crearVueloCommand);

		verify(_iVueloRepository).Create(resp);
		verify(_unitOfWork).commit();

		Assert.assertEquals(VueloCreado.class, resp.domainEvents.get(0).getClass());
		Assert.assertEquals(nroVuelo, resp.nroVuelo);
		Assert.assertEquals(keyAeronave, resp.keyAeronave);
		Assert.assertEquals(keyAeropuertoOrigen, resp.keyAeropuertoOrigen);
		Assert.assertEquals(keyAeropuertoDestino, resp.keyAeropuertoDestino);
		Assert.assertEquals(fecha_salida, resp.fecha_salida);
		Assert.assertEquals(fecha_arribe, resp.fecha_arribe);
	}
}

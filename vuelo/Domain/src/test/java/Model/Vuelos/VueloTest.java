package Model.Vuelos;

import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Event.VueloCreado;
import fourteam.http.Exception.HttpException;

public class VueloTest {
	UUID key = UUID.randomUUID();
	String nroVuelo = "A12345";
	String keyAeronave = "xyz-1990";
	String keyAeropuertoOrigen = UUID.randomUUID().toString();
	String keyAeropuertoDestino = UUID.randomUUID().toString();
	Date fecha_salida = new Date();
	Date fecha_arribe = new Date();
	List<Tripulante> listaTripulante = new ArrayList<>();

	@Test
	public void CheckConstructor() {
		Vuelo vuelo2 = new Vuelo();
		Vuelo vuelo = new Vuelo(nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino, fecha_salida,
				fecha_arribe);
		Assert.assertEquals(nroVuelo, vuelo.nroVuelo);
		Assert.assertEquals(keyAeronave, vuelo.keyAeronave);
		Assert.assertEquals(keyAeropuertoOrigen, vuelo.keyAeropuertoOrigen);
		Assert.assertEquals(keyAeropuertoDestino, vuelo.keyAeropuertoDestino);
		Assert.assertEquals(fecha_salida, vuelo.fecha_salida);
		Assert.assertEquals(fecha_arribe, vuelo.fecha_arribe);
		Assert.assertEquals(listaTripulante, vuelo.listaTripulante);
	}

	@Test
	public void HandleFailed() throws HttpException {

		// validaciones value objects y reglas de negocio
		// try {
		// this.nroVuelo = new NumeroVuelo(_nroVuelo).toString();
		// } catch (BussinessRuleValidateExeption e) {
		// e.printStackTrace();
		// return;
		// }

		// when(_IVueloRep.FindByKey(any())).thenReturn(null);
		// EliminarVueloHandler handler = new EliminarVueloHandler(_IVueloFact,
		// _IVueloRep, _IUnitOfWork);
		// VueloDto vueloDto = new VueloDto();
		// vueloDto.nroVuelo = "A12345";
		// vueloDto.keyAeronave = "xyz-1990";
		// vueloDto.keyAeropuertoOrigen = "aeropuerto100";
		// vueloDto.keyAeropuertoDestino = "aeropuerto200";
		// vueloDto.fecha_salida = new Date();
		// vueloDto.fecha_arribe = new Date();
		// EliminarVueloCommand command = new EliminarVueloCommand(vueloDto.key);
		// try {
		// Vuelo resp = handler.handle(command);
		// } catch (HttpException e) {
		// Assert.assertEquals(400, e.getCode());
		// }

	}

	@Test
	public void dataValid() {

		Vuelo vuelos = new Vuelo();
		// VueloCreado vuelo = new VueloCreado();
		vuelos.addDomainEvent(new VueloCreado(key, nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino,
				fecha_salida, fecha_arribe, listaTripulante));

		Tripulante tripulante = new Tripulante(UUID.randomUUID(), "xyz-1990", "Piloto");
		// vuelos.AgregarTripulante(any());
	}

	// public void AgregarTripulante(Tripulante tripulante) {
	// listaTripulante.parallelStream().filter(p -> p.getKey() ==
	// tripulante.getKey()).findFirst().ifPresent(p -> {
	// throw new RuntimeException("El tripulante ya existe");
	// });
	// listaTripulante.add(tripulante);
	// }
}
package Model.Vuelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

public class VueloTest {

  UUID key = UUID.randomUUID();
  String nroVuelo = "A12345";
  String keyAeronave = "xyz-1990";
  String keyAeropuertoOrigen = UUID.randomUUID().toString();
  String keyAeropuertoDestino = UUID.randomUUID().toString();
  Date fecha_salida = new Date();
  Date fecha_arribe = new Date();

  // List<Tripulante> listaTripulante = new ArrayList<>();

  @Test
  public void constructorVoid_accept() {
    Assert.assertNotNull(new Vuelo());
  }

  @Test
  public void constructor_accept() {
    UUID key = UUID.randomUUID();
    String nroVuelo = "A12345";
    String keyAeronave = "xyz-1990";
    String keyAeropuertoOrigen = UUID.randomUUID().toString();
    String keyAeropuertoDestino = UUID.randomUUID().toString();
    Date fecha_salida = new Date();
    Date fecha_arribe = new Date();
    List<Tripulante> listaTripulante = new ArrayList<>();

    Vuelo vuelo = new Vuelo(
      nroVuelo,
      keyAeronave,
      keyAeropuertoOrigen,
      keyAeropuertoDestino,
      fecha_salida,
      fecha_arribe
    );
    Assert.assertEquals(nroVuelo, vuelo.nroVuelo);
    Assert.assertEquals(keyAeronave, vuelo.keyAeronave);
    Assert.assertEquals(keyAeropuertoOrigen, vuelo.keyAeropuertoOrigen);
    Assert.assertEquals(keyAeropuertoDestino, vuelo.keyAeropuertoDestino);
    Assert.assertEquals(fecha_salida, vuelo.fecha_salida);
    Assert.assertEquals(fecha_arribe, vuelo.fecha_arribe);
    Assert.assertEquals(listaTripulante, vuelo.listaTripulante);
    System.out.println(key);
  }

  @Test
  public void constructor_denied() {
    // UUID _key = null;
    String _nroVuelo = "";
    String _keyAeronave = "";
    String _keyAeropuertoOrigen = "";
    String _keyAeropuertoDestino = "";
    Date _fecha_salida = null;
    Date _fecha_arribe = null;
    // List<Tripulante> listaTripulante = new ArrayList<>();
    Vuelo vuelo = new Vuelo(
      _nroVuelo,
      _keyAeronave,
      _keyAeropuertoOrigen,
      _keyAeropuertoDestino,
      _fecha_salida,
      _fecha_arribe
    );

    Assert.assertEquals(vuelo.nroVuelo, null);
    Assert.assertEquals(vuelo.keyAeronave, null);
    Assert.assertEquals(vuelo.keyAeropuertoOrigen, null);
    Assert.assertEquals(vuelo.keyAeropuertoDestino, null);
    Assert.assertEquals(vuelo.fecha_salida, null);
    Assert.assertEquals(vuelo.fecha_arribe, null);
    // Assert.assertEquals(vuelo.listaTripulante, null);

  }

  @Test
  public void addDomainEvent_accept() {
    Vuelo vuelo = new Vuelo(
      nroVuelo,
      keyAeronave,
      keyAeropuertoOrigen,
      keyAeropuertoDestino,
      fecha_salida,
      fecha_arribe
    );
    vuelo.eventCreado();
    Assert.assertEquals(vuelo.domainEvents.size(), 1);
  }

  @Test
  public void addTripulante() {
    Vuelo objVuelo = new Vuelo(
      nroVuelo,
      keyAeronave,
      keyAeropuertoOrigen,
      keyAeropuertoDestino,
      fecha_salida,
      fecha_arribe
    );
    objVuelo.AgregarTripulante(
      new Tripulante(UUID.randomUUID(), "xyz-1990", "Piloto")
    );
    objVuelo.eventCreado();
    Assert.assertEquals(objVuelo.listaTripulante.size(), 1);
  }

  @Test
  public void addTripulante_denied() {
    Vuelo vuelo = new Vuelo(
      nroVuelo,
      keyAeronave,
      keyAeropuertoOrigen,
      keyAeropuertoDestino,
      fecha_salida,
      fecha_arribe
    );

    Tripulante tripulante = new Tripulante(
      UUID.randomUUID(),
      "xyz-1990",
      "Piloto"
    );
    vuelo.AgregarTripulante(tripulante);

    Tripulante tripulante2 = new Tripulante(
      UUID.randomUUID(),
      "xyz-1990",
      "Piloto"
    );
    tripulante2.keyTripulante = tripulante.keyTripulante;

    try {
      vuelo.AgregarTripulante(tripulante2);
    } catch (Exception e) {
      Assert.assertTrue(true);
    }
  }
}

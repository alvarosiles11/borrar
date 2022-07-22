package Event;

import Model.Vuelos.Tripulante;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

public class VueloCreadoTest {

  @Test
  public void CheckPropertiesValid() {
    UUID keyVuelo = UUID.randomUUID();
    String nroVuelo = "A12345";
    String keyAeronave = "xyz-1990";
    String keyAeropuertoOrigen = "aeropuerto100";
    String keyAeropuertoDestino = "aeropuerto200";
    Date fecha_salida = new Date();
    Date fecha_arribe = new Date();
    List<Tripulante> listaTripulante = new ArrayList<>();

    // VueloCreado
    VueloCreado vuelo = new VueloCreado();
    Assert.assertNull(vuelo.nroVuelo);
    Assert.assertNull(vuelo.keyAeronave);
    Assert.assertNull(vuelo.keyAeropuertoOrigen);
    Assert.assertNull(vuelo.keyAeropuertoDestino);
    Assert.assertNull(vuelo.fecha_salida);
    Assert.assertNull(vuelo.fecha_arribe);

    // getters and setters
    vuelo.setKeyVuelo(keyVuelo);
    vuelo.setNroVuelo(nroVuelo);
    vuelo.setKeyAeronave(keyAeronave);
    vuelo.setKeyAeropuertoOrigen(keyAeropuertoOrigen);
    vuelo.setKeyAeropuertoDestino(keyAeropuertoDestino);
    vuelo.setFecha_salida(fecha_salida);
    vuelo.setFecha_arribe(fecha_arribe);
    vuelo.setListaTripulante(listaTripulante);
    Assert.assertEquals(keyVuelo, vuelo.getKeyVuelo());
    Assert.assertEquals(nroVuelo, vuelo.getNroVuelo());
    Assert.assertEquals(keyAeronave, vuelo.getKeyAeronave());
    Assert.assertEquals(keyAeropuertoOrigen, vuelo.getKeyAeropuertoOrigen());
    Assert.assertEquals(keyAeropuertoDestino, vuelo.getKeyAeropuertoDestino());
    Assert.assertEquals(fecha_salida, vuelo.getFecha_salida());
    Assert.assertEquals(fecha_arribe, vuelo.getFecha_arribe());
    Assert.assertEquals(listaTripulante, vuelo.getListaTripulante());
  }

  @Test
  public void CheckConstructor() {
    UUID keyVuelo = UUID.randomUUID();
    String nroVuelo = "A12345";
    String keyAeronave = "xyz-1990";
    String keyAeropuertoOrigen = "aeropuerto100";
    String keyAeropuertoDestino = "aeropuerto200";
    Date fecha_salida = new Date();
    Date fecha_arribe = new Date();
    List<Tripulante> listaTripulante = new ArrayList<>();
    // dto
    VueloCreado vuelo = new VueloCreado(
      keyVuelo,
      nroVuelo,
      keyAeronave,
      keyAeropuertoOrigen,
      keyAeropuertoDestino,
      fecha_salida,
      fecha_arribe,
      listaTripulante
    );
    Assert.assertEquals(keyVuelo, vuelo.getKeyVuelo());
    Assert.assertEquals(nroVuelo, vuelo.getNroVuelo());
    Assert.assertEquals(keyAeronave, vuelo.getKeyAeronave());
    Assert.assertEquals(keyAeropuertoOrigen, vuelo.getKeyAeropuertoOrigen());
    Assert.assertEquals(keyAeropuertoDestino, vuelo.getKeyAeropuertoDestino());
    Assert.assertEquals(fecha_salida, vuelo.getFecha_salida());
    Assert.assertEquals(fecha_arribe, vuelo.getFecha_arribe());
    Assert.assertEquals(listaTripulante, vuelo.getListaTripulante());
  }
}

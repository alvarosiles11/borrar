package UseCases.Command.Vuelos.Crear;

import Dto.VueloDto;
import fourteam.mediator.Request;
import java.util.Date;

public class CrearVueloCommand implements Request<VueloDto> {

  public String nroVuelo;
  public String keyAeronave;
  public String keyAeropuertoOrigen;
  public String keyAeropuertoDestino;
  public Date fecha_salida;
  public Date fecha_arribe;

  public CrearVueloCommand(VueloDto vueloDto) {
    this.nroVuelo = vueloDto.nroVuelo;
    this.keyAeronave = vueloDto.keyAeronave;
    this.keyAeropuertoOrigen = vueloDto.keyAeropuertoOrigen;
    this.keyAeropuertoDestino = vueloDto.keyAeropuertoDestino;
    this.fecha_salida = vueloDto.fecha_salida;
    this.fecha_arribe = vueloDto.fecha_arribe;
  }
}

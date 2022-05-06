package Application.UseCases.Command.Vuelos;

import java.util.Date;
import java.util.List;

import Application.Dto.VueloDto;
import Domain.Model.Vuelos.Tripulante;
import SharedKernel.mediator.Request;

public class CrearVueloCommand implements Request<VueloDto> {

	public String nroVuelo;
	public String keyAeronave;
	public String keyAeropuertoOrigen;
	public String keyAeropuertoDestino;
	public Date fecha_salida;
	public Date fecha_arribe;
	public List<Tripulante> listaTripulante;

	public CrearVueloCommand(VueloDto vueloDto) {
		this.nroVuelo = vueloDto.nroVuelo;
		this.keyAeronave = vueloDto.keyAeronave;
		this.keyAeropuertoOrigen = vueloDto.keyAeropuertoOrigen;
		this.keyAeropuertoDestino = vueloDto.keyAeropuertoDestino;
		this.fecha_salida = vueloDto.fecha_salida;
		this.fecha_arribe = vueloDto.fecha_arribe;
		this.listaTripulante = vueloDto.listaTripulante;
	}
}
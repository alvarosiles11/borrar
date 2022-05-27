package dmsnur.Application.UseCases.Command.Vuelos.Crear;

import java.util.Date;
import java.util.List;

import dmsnur.Application.Dto.TripulanteDto;
import dmsnur.Application.Dto.VueloDto;
import dmsnur.SharedKernel.mediator.Request;

public class CrearVueloCommand implements Request<VueloDto> {

	public String nroVuelo;
	public String keyAeronave;
	public String keyAeropuertoOrigen;
	public String keyAeropuertoDestino;
	public Date fecha_salida;
	public Date fecha_arribe;
	public List<TripulanteDto> listaTripulante;

	public CrearVueloCommand(VueloDto vueloDto) {
		this.nroVuelo = vueloDto.nroVuelo;
		this.keyAeronave = vueloDto.keyAeronave;
		this.keyAeropuertoOrigen = vueloDto.keyAeropuertoOrigen;
		this.keyAeropuertoDestino = vueloDto.keyAeropuertoDestino;
		this.fecha_salida = vueloDto.fecha_salida;
		this.fecha_arribe = vueloDto.fecha_arribe;
	}

	public List<TripulanteDto> getListaTripulante() {
		return listaTripulante;
	}

	public void setListaTripulante(List<TripulanteDto> listaTripulante) {
		this.listaTripulante = listaTripulante;
	}

}
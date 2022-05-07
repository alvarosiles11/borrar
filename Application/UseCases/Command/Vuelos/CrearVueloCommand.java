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

	public String getNroVuelo() {
		return nroVuelo;
	}

	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
	}

	public String getKeyAeronave() {
		return keyAeronave;
	}

	public void setKeyAeronave(String keyAeronave) {
		this.keyAeronave = keyAeronave;
	}

	public String getKeyAeropuertoOrigen() {
		return keyAeropuertoOrigen;
	}

	public void setKeyAeropuertoOrigen(String keyAeropuertoOrigen) {
		this.keyAeropuertoOrigen = keyAeropuertoOrigen;
	}

	public String getKeyAeropuertoDestino() {
		return keyAeropuertoDestino;
	}

	public void setKeyAeropuertoDestino(String keyAeropuertoDestino) {
		this.keyAeropuertoDestino = keyAeropuertoDestino;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public Date getFecha_arribe() {
		return fecha_arribe;
	}

	public void setFecha_arribe(Date fecha_arribe) {
		this.fecha_arribe = fecha_arribe;
	}

	public List<Tripulante> getListaTripulante() {
		return listaTripulante;
	}

	public void setListaTripulante(List<Tripulante> listaTripulante) {
		this.listaTripulante = listaTripulante;
	}
}
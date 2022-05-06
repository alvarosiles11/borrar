package Application.UseCases.Command.Vuelos;

import java.util.List;

import Application.Dto.VueloDto;
import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import SharedKernel.mediator.Request;

public class CrearVueloCommand implements Request<VueloDto> {

	public String nroVuelo;
	public List<Tripulante> listaTripulante;
	public List<AsientoDisponible> listaAsientoDisponible;

	public CrearVueloCommand(VueloDto vueloDto) {
		this.nroVuelo = vueloDto.nroVuelo;
		this.listaTripulante = vueloDto.listaTripulante;
		this.listaAsientoDisponible = vueloDto.listaAsientoDisponible;
	}

}

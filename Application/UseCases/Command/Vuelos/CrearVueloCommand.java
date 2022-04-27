package Application.UseCases.Command.Vuelos;

import java.util.List;
import java.util.UUID;

import Application.Dto.VueloDto;
import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import kernel.mediator.Request;

public class CrearVueloCommand implements Request<VueloDto> {

 
    public UUID nrovuelo;
    public List<Tripulante> listaTripulante;
    public List<AsientoDisponible> listaAsientoDisponible;
	
	public CrearVueloCommand(VueloDto vueloDto) {
		this.nrovuelo = vueloDto.nrovuelo;
		this.listaTripulante = vueloDto.listaTripulante;
		this.listaAsientoDisponible = vueloDto.listaAsientoDisponible;
	}
 


}

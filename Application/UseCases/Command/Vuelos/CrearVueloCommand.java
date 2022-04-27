package Application.UseCases.Command.Vuelos;

import java.util.List;
import java.util.UUID;

import Application.Dto.AsientoDisponibleDto;
import Application.Dto.TripulanteDto;
import Application.Dto.VueloDto;
import kernel.mediator.Request;

public class CrearVueloCommand implements Request<VueloDto> {

 
    public UUID nrovuelo;
    public List<TripulanteDto> ListaTripulante;
    public List<AsientoDisponibleDto> ListaAsientoDisponible;
	
	public CrearVueloCommand(VueloDto vueloDto) {
		this.nrovuelo = vueloDto.nrovuelo;
		ListaTripulante = vueloDto.listaTripulante;
		ListaAsientoDisponible = vueloDto.listaAsientoDisponible;
	}
 


}

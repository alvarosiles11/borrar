package Application.UseCases.Command.Vuelos;

import java.util.List;
import java.util.UUID;

import Application.Dto.Vuelo.TripulanteDto;
import kernel.mediator.Request;

public class CrearListaTripulantesCommand implements Request<UUID> {

	public List<TripulanteDto> tripulantes;

	public CrearListaTripulantesCommand() {
		System.out.println("entro");
	}

	public CrearListaTripulantesCommand(List<TripulanteDto> tripulantes) {
		this.tripulantes = tripulantes;
	}

	public List<TripulanteDto> getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(List<TripulanteDto> tripulantes) {
		this.tripulantes = tripulantes;
	}

}

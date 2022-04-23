package Application.UseCases.Command.Vuelos;

import java.util.List;
import java.util.UUID;
import Application.Dto.Vuelo.AsientoDisponibleDto;
import kernel.mediator.Request;

public class CrearListaAsientosDisponiblesCommand implements Request<UUID> {

	public List<AsientoDisponibleDto> asientos;

	public CrearListaAsientosDisponiblesCommand() {
		System.out.println("entro");
	}

	public CrearListaAsientosDisponiblesCommand(List<AsientoDisponibleDto> asientos) {
		this.asientos = asientos;
	}

	public List<AsientoDisponibleDto> getAsientos() {
		return asientos;
	}

	public void setAsientos(List<AsientoDisponibleDto> asientos) {
		this.asientos = asientos;
	}

}

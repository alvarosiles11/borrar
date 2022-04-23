package Application.UseCases.Command.Vuelos;

import java.util.List;
import java.util.UUID;

import Application.Dto.Vuelo.AsientoDisponibleDto;
import kernel.mediator.Request;

public class CrearVueloCommand implements Request<UUID> {

	public List<AsientoDisponibleDto> asientos;

	public CrearVueloCommand() {
		System.out.println("entro");
	}

	public CrearVueloCommand(List<AsientoDisponibleDto> asientos) {
		this.asientos = asientos;
	}

	public List<AsientoDisponibleDto> getAsientos() {
		return asientos;
	}

	public void setAsientos(List<AsientoDisponibleDto> asientos) {
		this.asientos = asientos;
	}

}

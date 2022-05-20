package Application.UseCases.Command.Tripulantes.Crear;

import java.util.UUID;

import Application.Dto.TripulanteDto;
import SharedKernel.mediator.Request;

public class CrearTripulanteCommand implements Request<TripulanteDto> {

	public UUID keyVuelo; // vuelo

	public String keyTripulante; // tripulante
	public String cargo; // cargo

	public CrearTripulanteCommand(TripulanteDto tripulanteDto) {
		// this.keyVuelo = tripulanteDto.keyVuelo;
		this.keyTripulante = tripulanteDto.keyTripulante;
		this.cargo = tripulanteDto.cargo;
	}

	public String getKeyTripulante() {
		return keyTripulante;
	}

	public void setKeyTripulante(String keyTripulante) {
		this.keyTripulante = keyTripulante;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
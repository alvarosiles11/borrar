package Application.UseCases.Command.Tripulantes;

import java.util.UUID;

import Application.Dto.TripulanteDto;
import kernel.mediator.Request;

public class CrearTripulanteCommand implements Request<TripulanteDto>{

    public UUID nroVuelo;
    public String descripcion;

    public CrearTripulanteCommand(TripulanteDto ero) {
        this.nroVuelo = ero.nrovuelo;
        this.descripcion = ero.descripcion;
    }

  
}

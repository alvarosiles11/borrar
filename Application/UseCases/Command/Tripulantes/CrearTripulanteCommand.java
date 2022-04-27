package Application.UseCases.Command.Tripulantes;

import Application.Dto.TripulanteDto;
import kernel.mediator.Request;

public class CrearTripulanteCommand implements Request<TripulanteDto>{

   
    public String descripcion;

    public CrearTripulanteCommand(TripulanteDto ero) {
        this.descripcion = ero.descripcion;
    }

  
}

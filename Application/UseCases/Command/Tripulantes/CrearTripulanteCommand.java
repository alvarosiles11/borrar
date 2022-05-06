package Application.UseCases.Command.Tripulantes;

import Application.Dto.TripulanteDto;
import SharedKernel.mediator.Request;

public class CrearTripulanteCommand implements Request<TripulanteDto> {

    public String keyTripulante; //tripulante
    public String cargo; // cargo
    

    public CrearTripulanteCommand(TripulanteDto ero) {
        this.keyTripulante = ero.keyTripulante;
        this.cargo = ero.cargo;
     }

}
package Application.UseCases.Command.Tripulantes;

import Application.Dto.TripulanteDto;
import SharedKernel.mediator.Request;

public class CrearTripulanteCommand implements Request<TripulanteDto> {

    public String nroVuelo;
    public String descripcion;
    public String nombre;

    public CrearTripulanteCommand(TripulanteDto ero) {
        this.nroVuelo = ero.nrovuelo;
        this.descripcion = ero.descripcion;
        this.nombre = ero.nombre;
    }

}
package Application.UseCases.Command.AsientoDisponibles;

import Application.Dto.AsientoDisponibleDto;
import SharedKernel.mediator.Request;

public class CrearAsientoDisponibleCommand implements Request<AsientoDisponibleDto> {

    public String nrovuelo;
    public String matricula;
    public String clase;
    public double precio;
    public String estado;

    public CrearAsientoDisponibleCommand(AsientoDisponibleDto asientoDisponibleDto) {
        this.nrovuelo = asientoDisponibleDto.nrovuelo;
        this.matricula = asientoDisponibleDto.matricula;
        this.clase = asientoDisponibleDto.clase;
        this.precio = asientoDisponibleDto.precio;
        this.estado = asientoDisponibleDto.estado;
    }

}

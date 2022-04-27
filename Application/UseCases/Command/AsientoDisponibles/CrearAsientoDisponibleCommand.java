package Application.UseCases.Command.AsientoDisponibles;

import java.util.UUID;

import Application.Dto.AsientoDisponibleDto;
import kernel.mediator.Request;

public class CrearAsientoDisponibleCommand implements Request<AsientoDisponibleDto> {

    public UUID nrovuelo;
    public String clase;
    public double precio;
    public String estado;

    public CrearAsientoDisponibleCommand(AsientoDisponibleDto asientoDisponibleDto) {
        this.nrovuelo = asientoDisponibleDto.nrovuelo;
        this.clase = asientoDisponibleDto.clase;
        this.precio = asientoDisponibleDto.precio;
        this.estado = asientoDisponibleDto.estado;
    }

}

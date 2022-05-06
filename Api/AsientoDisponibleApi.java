package Api;

import java.util.ArrayList;
import java.util.List;

import Application.Dto.AsientoDisponibleDto;
import Application.UseCases.Command.AsientoDisponibles.CrearAsientoDisponibleCommand;
import Application.UseCases.Queries.AsientoDisponibles.GetAsientoDisponibleByKeyQuery;
import Domain.Model.Vuelos.AsientoDisponible;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.http.annotation.DeleteMapping;
import SharedKernel.http.annotation.GetMapping;
import SharedKernel.http.annotation.PathVariable;
import SharedKernel.http.annotation.PostMapping;
import SharedKernel.http.annotation.PutMapping;
import SharedKernel.http.annotation.RequestBody;
import SharedKernel.http.annotation.RequestMapping;
import SharedKernel.http.annotation.RestController;
import SharedKernel.mediator.Mediator;
import SharedKernel.mediator.Response;

@RestController
@RequestMapping("/asiento")

public class AsientoDisponibleApi {

    private Mediator _mediator;

    public AsientoDisponibleApi(Mediator mediator) {
        _mediator = mediator;
    }

    @GetMapping("/")
    public List<AsientoDisponible> getAll() {
        System.out.println("getAll exitoso");
        return new ArrayList<>();
    }

    @PostMapping("/registro")
    public Response<AsientoDisponible> register(@RequestBody CrearAsientoDisponibleCommand tripulante) {
        return _mediator.send(tripulante);
    }

    @GetMapping("/{key}")
    public Response<AsientoDisponibleDto> getByKey(@PathVariable GetAsientoDisponibleByKeyQuery request)
            throws HttpException {
        return _mediator.send(request);
    }

    @PutMapping("/{key}")
    public AsientoDisponible edit(@RequestBody AsientoDisponible tripulante, @PathVariable String key) {
        System.out.println("edit exitoso");
        return tripulante;
    }

    @DeleteMapping("/{key}")
    public String delete(@PathVariable String key) {
        System.out.println("delete exitoso");
        return "exito";
    }
}

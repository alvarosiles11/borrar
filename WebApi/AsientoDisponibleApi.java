package WebApi;

import java.util.ArrayList;
import java.util.List;

import Application.Dto.AsientoDisponibleDto;
import Application.UseCases.Command.Tripulantes.CrearTripulanteCommand;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyQuery;
import Domain.Model.Vuelos.AsientoDisponible;
import kernel.http.annotation.DeleteMapping;
import kernel.http.annotation.GetMapping;
import kernel.http.annotation.PathVariable;
import kernel.http.annotation.PostMapping;
import kernel.http.annotation.PutMapping;
import kernel.http.annotation.RequestBody;
import kernel.http.annotation.RequestMapping;
import kernel.http.annotation.RestController;
import kernel.mediator.Mediator;
import kernel.mediator.Response;

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
    public Response<AsientoDisponible> register(@RequestBody CrearTripulanteCommand asiento) {
        System.out.println("registro exitoso");
        Response<AsientoDisponible> response = _mediator.send(asiento);
        return response;
    }

    @GetMapping("/{key}")
    public AsientoDisponibleDto getByKey(@PathVariable GetTripulanteByKeyQuery request) {
        System.out.println("getByKey exitoso");
        return new AsientoDisponibleDto();
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

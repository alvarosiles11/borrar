package WebApi;

import java.util.ArrayList;
import java.util.List;

import Application.Dto.TripulanteDto;
import Application.UseCases.Command.Tripulantes.CrearTripulanteCommand;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyQuery;
import Domain.Model.Vuelos.Tripulante;
import kernel.http.annotation.DeleteMapping;
import kernel.http.annotation.GetMapping;
import kernel.http.annotation.PathVariable;
import kernel.http.annotation.PostMapping;
import kernel.http.annotation.RequestBody;
import kernel.http.annotation.RequestMapping;
import kernel.http.annotation.RestController;
import kernel.mediator.Mediator;
import kernel.mediator.Response;

@RestController
@RequestMapping("/tripulante")

public class TripulanteApi {

    private Mediator _mediator;

    public TripulanteApi(Mediator mediator) {
        _mediator = mediator;
    }

    @GetMapping("/")
    public List<Tripulante> getAll() {
        System.out.println("getAll exitoso");
        return new ArrayList<>();
    }

    // @PostMapping("/registro")
    // public Response<Tripulante> register(@RequestBody CrearTripulanteCommand
    // tripulante) {
    // System.out.println("registro exitoso");
    // return _mediator.send(tripulante);
    // }

    @PostMapping("/registro")
    public Response<Tripulante> register(@RequestBody CrearTripulanteCommand tripulante) {
        System.out.println("registro exitoso");
        Response<Tripulante> response = _mediator.send(tripulante);
        return response;
    }

    @GetMapping("/{key}")
    public TripulanteDto getByKey(@PathVariable GetTripulanteByKeyQuery request) {
        System.out.println("getByKey exitoso");
        return new TripulanteDto();
    }

    // @PutMapping("/{key}")
    // public Tripulante edit(@RequestBody Tripulante tripulante, @PathVariable
    // String key) {
    // System.out.println("edit exitoso");
    // return new Tripulante();
    // }

    @DeleteMapping("/{key}")
    public String delete(@PathVariable String key) {
        System.out.println("delete exitoso");
        return "exito";
    }
}

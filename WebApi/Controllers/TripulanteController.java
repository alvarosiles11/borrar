package WebApi.Controllers;

import java.util.ArrayList;
import java.util.List;

import Application.Dto.TripulanteDto;
import Application.UseCases.Command.Tripulantes.CrearTripulanteCommand;
import Application.UseCases.Queries.Tripulantes.GetTripulanteByKeyQuery;
import Domain.Model.Vuelos.Tripulante;
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
@RequestMapping("/tripulante")

public class TripulanteController {

    private Mediator _mediator;

    public TripulanteController(Mediator mediator) {
        _mediator = mediator;
    }

    @GetMapping("/")
    public List<Tripulante> getAll() {
        System.out.println("getAll exitoso");
        return new ArrayList<>();
    }

    @PostMapping("/registro")
    public Response<Tripulante> register(@RequestBody CrearTripulanteCommand tripulante) {
        return _mediator.send(tripulante);
    }

    @GetMapping("/{key}")
    public Response<TripulanteDto> getByKey(@PathVariable GetTripulanteByKeyQuery request) throws HttpException {
        return _mediator.send(request);
    }

    @PutMapping("/{key}")
    public Tripulante edit(@RequestBody Tripulante tripulante, @PathVariable String key) {
        System.out.println("edit exitoso");
        return tripulante;
    }

    @DeleteMapping("/{key}")
    public String delete(@PathVariable String key) {
        System.out.println("delete exitoso");
        return "exito";
    }
}

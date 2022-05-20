package WebApi.Controllers;

import java.util.List;

import Application.Dto.TripulanteDto;
import Application.UseCases.Command.Tripulantes.Crear.CrearTripulanteCommand;
import Application.UseCases.Command.Tripulantes.Editar.EditarTripulanteCommand;
import Application.UseCases.Command.Tripulantes.Eliminar.EliminarTripulanteCommand;
import Application.UseCases.Queries.Tripulantes.GetAll.GetAllTripulanteQuery;
import Application.UseCases.Queries.Tripulantes.GetByKey.GetTripulanteByKeyQuery;
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
    public Response<List<Tripulante>> getAll() throws HttpException {
        return _mediator.send(new GetAllTripulanteQuery());
    }

    @PostMapping("/registro")
    public Response<Tripulante> register(@RequestBody CrearTripulanteCommand _tripulante) throws HttpException {
        return _mediator.send(_tripulante);
    }

    @GetMapping("/{key}")
    public Response<TripulanteDto> getByKey(@PathVariable GetTripulanteByKeyQuery request) throws HttpException {
        return _mediator.send(request);
    }

    @PutMapping("/{key}")
    public Response<Tripulante> edit(@RequestBody Tripulante _tripulante, @PathVariable EditarTripulanteCommand request)
            throws HttpException {
        request._TripulanteDto.key = _tripulante.key;
        return _mediator.send(request);
    }

    @DeleteMapping("/{key}")
    public Response<Tripulante> delete(@PathVariable EliminarTripulanteCommand request) throws HttpException {
        return _mediator.send(request);
    }
}
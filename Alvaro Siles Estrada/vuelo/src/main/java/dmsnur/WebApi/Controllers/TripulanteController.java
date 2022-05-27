package dmsnur.WebApi.Controllers;

import java.util.List;

import dmsnur.Application.Dto.TripulanteDto;
import dmsnur.Application.UseCases.Command.Tripulantes.Crear.CrearTripulanteCommand;
import dmsnur.Application.UseCases.Command.Tripulantes.Editar.EditarTripulanteCommand;
import dmsnur.Application.UseCases.Command.Tripulantes.Eliminar.EliminarTripulanteCommand;
import dmsnur.Application.UseCases.Queries.Tripulantes.GetAll.GetAllTripulanteQuery;
import dmsnur.Application.UseCases.Queries.Tripulantes.GetByKey.GetTripulanteByKeyQuery;
import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.http.annotation.DeleteMapping;
import dmsnur.SharedKernel.http.annotation.GetMapping;
import dmsnur.SharedKernel.http.annotation.PathVariable;
import dmsnur.SharedKernel.http.annotation.PostMapping;
import dmsnur.SharedKernel.http.annotation.PutMapping;
import dmsnur.SharedKernel.http.annotation.RequestBody;
import dmsnur.SharedKernel.http.annotation.RequestMapping;
import dmsnur.SharedKernel.http.annotation.RestController;
import dmsnur.SharedKernel.mediator.Mediator;
import dmsnur.SharedKernel.mediator.Response;

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
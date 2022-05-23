package WebApi.Controllers;

import java.util.List;

import Application.Dto.VueloDto;
import Application.UseCases.Command.Vuelos.Crear.CrearVueloCommand;
import Application.UseCases.Command.Vuelos.Editar.EditarVueloCommand;
import Application.UseCases.Command.Vuelos.Eliminar.EliminarVueloCommand;
import Application.UseCases.Queries.Vuelos.GetAll.GetAllVueloQuery;
import Application.UseCases.Queries.Vuelos.GetByKey.GetVueloByKeyQuery;
import Domain.Model.Vuelos.Vuelo;
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
@RequestMapping("/vuelo")

public class VueloController {

    private Mediator _mediator;

    public VueloController(Mediator mediator) {
        _mediator = mediator;
    }

    @GetMapping("/")
    public Response<List<Vuelo>> getAll() throws HttpException {
        // List<Vuelo> vuelos = new ArrayList<>();
        // List<Tripulante> tripulantes = new ArrayList<>();
        // System.out.println("getAll exitoso");
        // return vuelos;
        System.out.println("vuelo getAll exitoso");
        return _mediator.send(new GetAllVueloQuery());
    }

    @PostMapping("/registro")
    public Response<Vuelo> register(@RequestBody CrearVueloCommand _vuelo) throws HttpException {
        System.out.println("vuelo register exitoso");
        return _mediator.send(_vuelo);
    }

    @GetMapping("/{key}")
    public Response<VueloDto> getByKey(@PathVariable GetVueloByKeyQuery request) throws HttpException {
        System.out.println("vuelo getByKey exitoso");
        return _mediator.send(request);
    }

    @PutMapping("/{key}")
    public Response<Vuelo> edit(@RequestBody Vuelo _Vuelo, @PathVariable EditarVueloCommand request)
            throws HttpException {
        request._VueloDto.nroVuelo = _Vuelo.nroVuelo;
        request._VueloDto.keyAeronave = _Vuelo.keyAeronave;
        request._VueloDto.keyAeropuertoOrigen = _Vuelo.keyAeropuertoOrigen;
        request._VueloDto.keyAeropuertoDestino = _Vuelo.keyAeropuertoDestino;
        request._VueloDto.fecha_salida = _Vuelo.fecha_salida;
        request._VueloDto.fecha_arribe = _Vuelo.fecha_arribe;
        // request._VueloDto.listaTripulante = _Vuelo.listaTripulante;
        return _mediator.send(request);
    }

    @DeleteMapping("/{key}")
    public Response<Vuelo> delete(@PathVariable EliminarVueloCommand request) throws HttpException {
        System.out.println("vuelo delete exitoso");
        return _mediator.send(request);
    }
}
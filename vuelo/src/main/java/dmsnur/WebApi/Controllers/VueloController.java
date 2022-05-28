package dmsnur.WebApi.Controllers;

import java.util.List;

import dmsnur.Application.Dto.VueloDto;
import dmsnur.Application.UseCases.Command.Vuelos.Crear.CrearVueloCommand;
import dmsnur.Application.UseCases.Command.Vuelos.Editar.EditarVueloCommand;
import dmsnur.Application.UseCases.Command.Vuelos.Eliminar.EliminarVueloCommand;
import dmsnur.Application.UseCases.Queries.Vuelos.GetAll.GetAllVueloQuery;
import dmsnur.Application.UseCases.Queries.Vuelos.GetByKey.GetVueloByKeyQuery;
import dmsnur.Domain.Model.Vuelos.Vuelo;
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
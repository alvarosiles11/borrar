package WebApi.Controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import Application.Dto.VueloDto;
import Application.UseCases.Command.Vuelos.CrearVueloCommand;
import Application.UseCases.Queries.Vuelos.GetVueloByKeyQuery;
import Domain.Model.Vuelos.Tripulante;
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
    public List<Vuelo> getAll() {
        List<Vuelo> vuelos = new ArrayList<>();

        List<Tripulante> tripulantes = new ArrayList<>();

        tripulantes.add(new Tripulante(UUID.randomUUID().toString(), "capitan"));
        tripulantes.add(new Tripulante(UUID.randomUUID().toString(), "copiloto"));
        tripulantes.add(new Tripulante(UUID.randomUUID().toString(), "enfermera"));
        tripulantes.add(new Tripulante(UUID.randomUUID().toString(), "asistente"));

        vuelos.add(new Vuelo("_nroVuelo", "_keyAeronave", "_keyAeropuertoOrigen", "_keyAeropuertoDestino", new Date(),
                new Date(), tripulantes));
        System.out.println("getAll exitoso");
        return vuelos;
    }

    @PostMapping("/registro")
    public Response<Vuelo> register(@RequestBody CrearVueloCommand vuelo) {
        return _mediator.send(vuelo);
    }

    @GetMapping("/{key}")
    public Response<VueloDto> getByKey(@PathVariable GetVueloByKeyQuery request) throws HttpException {
        return _mediator.send(request);
    }

    @PutMapping("/{key}")
    public Vuelo edit(@RequestBody Vuelo _Vuelo, @PathVariable String key) {
        System.out.println("edit exitoso");
        return _Vuelo;
    }

    @DeleteMapping("/{key}")
    public String delete(@PathVariable String key) {
        System.out.println("delete exitoso");
        return "delete exito";
    }
}

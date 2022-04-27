package WebApi;

import java.util.ArrayList;
import java.util.List;

import Application.Dto.VueloDto;
import Application.UseCases.Command.Vuelos.CrearVueloCommand;
import Application.UseCases.Queries.Vuelos.GetVueloByKeyQuery;
import Domain.Model.Vuelos.Vuelo;
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
@RequestMapping("/vuelo")

public class VueloApi {

    private Mediator _mediator;

    public VueloApi(Mediator mediator) {
        _mediator = mediator;
    }

    @GetMapping("/")
    public List<Vuelo> getAll() {
        System.out.println("getAll exitoso");
        return new ArrayList<>();
    }

 
    @PostMapping("/registro")
    public Response<Vuelo> register(@RequestBody CrearVueloCommand param) {
        System.out.println("registro exitoso");
        Response<Vuelo> response = _mediator.send(param);
        return response;
    }

    @GetMapping("/{key}")
    public VueloDto getByKey(@PathVariable GetVueloByKeyQuery request) {
        System.out.println("getByKey exitoso");
        return new VueloDto();
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

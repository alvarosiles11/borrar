package WebApi;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Application.UseCases.Command.Vuelos.CrearVueloCommand;
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

    // @GetMapping("/")
    // public List<Vuelo> getAll() {
    // List<Vuelo> vuelos = new ArrayList<>();
    // vuelos.add(new Vuelo());
    // vuelos.add(new Vuelo());
    // return vuelos;
    // }

    // @GetMapping("/{key}")
    // public VueloDto getByKey(@PathVariable GetVueloByKeyQuery request)  {
    //     System.out.println("getByKey exitoso");
    //     return new VueloDto();
    // }

    // @GetMapping("/{key}")
    // public VueloDto getByKey(@PathVariable GetVueloByKeyQuery request) throws
    // HttpException {
    // VueloDto vueloDto = _mediator.send(request).data;
    // return vueloDto;
    // }

    @PostMapping("/registro")
    public Response<UUID> register(@RequestBody CrearVueloCommand vuelo) {
        Response<UUID> key = _mediator.send(vuelo);
        System.out.println("registro exitoso");
        return key;
    }
    // @PostMapping("/registro")
    // public Response<UUID> register(@RequestBody CrearVueloCommand vuelo) {
    // Response<UUID> key = _mediator.send(vuelo);
    // vuelo.agregarAsiento(new AsientoDisponible(vuelo.getKey(), 1, "primera"));
    // vuelo.agregarAsiento(new AsientoDisponible(vuelo.getKey(), 2, "primera"));

    // Vuelo vuelo1 = new Vuelo();
    // Aeronave aeronave = new Aeronave("Boeing", "777");
    // vuelo1.AgregarAeronave(aeronave);
    // vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A1",
    // "Comercial", 750));
    // vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A2",
    // "Comercial", 750));
    // vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A3",
    // "Comercial", 750));
    // vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A4",
    // "Comercial", 750));

    // return key;
    // }

    @PutMapping("/{key}")
    public Vuelo edit(@RequestBody Vuelo vuelo, @PathVariable String key) {
        System.out.println("edit exitoso");
        return vuelo;
    }

    @DeleteMapping("/{key}")
    public void delete(@PathVariable String key) {
        System.out.println("delete exitoso");
    }
}

package WebApi;

import java.util.List;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import Domain.Model.Aeronaves.Aeronave;
import Domain.Model.Vuelos.Vuelo;
import kernel.http.HttpStatus;
import kernel.http.Exception.HttpException;
import kernel.http.annotation.*;

@RestController
@RequestMapping("/vuelo")

public class VueloApi {

    @GetMapping("/")
    public List<Vuelo> getAll() {
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo());
        vuelos.add(new Vuelo());
        return vuelos;
    }

    @GetMapping("/{key}")
    public Vuelo getByKey(@PathVariable String key) throws HttpException {
        if (key.equals("1")) {
            throw new HttpException(HttpStatus.CONFLICT, "Not found");
        }
        System.out.println("entro getByKey");
        return new Vuelo();
    }

    @PostMapping("/registro")
    public Vuelo register(@RequestBody Vuelo vuelo) {

        JSONObject aeve = new JSONObject(new Aeronave("bomfo", "2001"));

        JSONArray arr = new JSONArray();
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "1"));
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "2"));
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "3"));
        arr.put(new JSONObject().put("key", UUID.randomUUID().toString()).put("numero", "4"));
        aeve.put("asientos", arr);

        vuelo.AgregarAeronave(aeve);
        return vuelo;
    }

    @PutMapping("/{key}")
    public Vuelo edit(@RequestBody Vuelo vuelo, @PathVariable String key) {
        return vuelo;
    }

    @DeleteMapping("/{key}")
    public void delete(@PathVariable String key) {
        System.out.println("entro delete");
    }

}

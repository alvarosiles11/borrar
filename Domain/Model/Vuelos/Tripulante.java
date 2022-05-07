package Domain.Model.Vuelos;

import java.util.UUID;

import com.google.gson.Gson;

import SharedKernel.core.Entity;

public class Tripulante extends Entity<UUID> {

    public String keyTripulante; // tripulante
    public String cargo; // cargo

    public Tripulante(String _keyTripulante, String _cargo) {
        this.key = UUID.randomUUID();
        this.keyTripulante = _keyTripulante;
        this.cargo = _cargo;
    }

    
    // public void eventCreado() {
    //     addDomainEvent(new VueloCreado(key, nroVuelo, keyAeronave, keyAeropuertoOrigen, keyAeropuertoDestino,
    //             fecha_salida, fecha_arribe, listaTripulante));
    // }

    @Override
    public String toString() {
        return new Gson().toJson(this, Tripulante.class);
    }

}
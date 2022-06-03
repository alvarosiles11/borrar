package Model.Vuelos;

import java.util.UUID;

import core.Entity;

public class Tripulante extends Entity<UUID> {

    public UUID keyVuelo;

    public String keyTripulante; // tripulante
    public String cargo; // cargo

    public Tripulante(UUID _keyVuelo, String _keyTripulante, String _cargo) {
        this.key = UUID.randomUUID();
        this.keyVuelo = _keyVuelo;
        this.keyTripulante = _keyTripulante;
        this.cargo = _cargo;
    }

    // @Override
    // public String toString() {
    // return new Gson().toJson(this, Tripulante.class);
    // }
}
package Dto;

import java.util.UUID;

public class TripulanteDto {

    public UUID key; // key del tripulante
    public UUID keyVuelo; // key del vuelo
    public String keyTripulante; // tripulante
    public String cargo; // cargo

    // Constructor
    public TripulanteDto() {
    }

    // Constructor
    public TripulanteDto(UUID keyVuelo, String keyTripulante, String cargo) {
        this.keyVuelo = keyVuelo;
        this.keyTripulante = keyTripulante;
        this.cargo = cargo;
    }

    // getters and setters

    public UUID getKeyVuelo() {
        return keyVuelo;
    }

    public UUID getKey() {
        return key;
    }

    public void setKey(UUID key) {
        this.key = key;
    }

    public void setKeyVuelo(UUID keyVuelo) {
        this.keyVuelo = keyVuelo;
    }

    public String getKeyTripulante() {
        return keyTripulante;
    }

    public void setKeyTripulante(String keyTripulante) {
        this.keyTripulante = keyTripulante;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
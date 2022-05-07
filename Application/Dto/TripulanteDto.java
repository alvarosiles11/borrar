package Application.Dto;

import java.util.UUID;

public class TripulanteDto {

    public UUID keyVuelo; // key del vuelo
    public String keyTripulante; // tripulante
    public String cargo; // cargo

    public TripulanteDto() {
    }

    public TripulanteDto(UUID keyVuelo, String keyTripulante, String cargo) {
        this.keyVuelo = keyVuelo;
        this.keyTripulante = keyTripulante;
        this.cargo = cargo;
    }

    public UUID getKeyVuelo() {
        return keyVuelo;
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
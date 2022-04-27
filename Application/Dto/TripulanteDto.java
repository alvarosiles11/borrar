package Application.Dto;

import java.util.UUID;

import com.google.gson.Gson;

public class TripulanteDto {

    // atributos y getters y setters
    public UUID nrovuelo;
    public String descripcion;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

package Application.Dto;

import java.util.UUID;

import com.google.gson.Gson;

public class AsientoDisponibleDto {

    // atributos y getters y setters
    public UUID nrovuelo;
    public String clase;
    public double precio;
    public String estado;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

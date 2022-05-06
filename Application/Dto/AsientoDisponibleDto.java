package Application.Dto;

import com.google.gson.Gson;

public class AsientoDisponibleDto {

    public String nrovuelo;
    public String matricula;
    public String clase;
    public double precio;
    public String estado;

    // TODO implementar getters y setters

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

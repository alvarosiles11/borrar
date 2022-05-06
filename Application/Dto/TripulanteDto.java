package Application.Dto;

import com.google.gson.Gson;

public class TripulanteDto {

    public String nrovuelo;
    public String descripcion; // cargo
    public String nombre; // nombre completo

    // TODO implementar getters y setters

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

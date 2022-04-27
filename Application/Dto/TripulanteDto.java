package Application.Dto;

import com.google.gson.Gson;

public class TripulanteDto {
    public String descripcion; // cargo

    public TripulanteDto() {
    }
   
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

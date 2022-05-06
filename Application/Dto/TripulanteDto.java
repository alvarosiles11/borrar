package Application.Dto;

import com.google.gson.Gson;

public class TripulanteDto {

    public String keyTripulante; //tripulante
    public String cargo; // cargo
    
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

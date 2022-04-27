package Application.Dto;

import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;

public class VueloDto {

    public UUID nrovuelo;
    public List<TripulanteDto> listaTripulante;
    public List<AsientoDisponibleDto> listaAsientoDisponible;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

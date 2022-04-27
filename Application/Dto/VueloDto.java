package Application.Dto;

import java.util.List;
import java.util.UUID;
import com.google.gson.Gson;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;

public class VueloDto {

    public UUID nrovuelo;
    public List<Tripulante> listaTripulante;
    public List<AsientoDisponible> listaAsientoDisponible;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

package Application.Dto;

import java.util.List;

import com.google.gson.Gson;

import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;

public class VueloDto {

    public String nroVuelo;
    public List<Tripulante> listaTripulante;
    public List<AsientoDisponible> listaAsientoDisponible;

    // TODO implementar getters y setters

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

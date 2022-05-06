package Application.Dto;

import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

import Domain.Model.Vuelos.Tripulante;

public class VueloDto {

    public String nroVuelo;
    public String keyAeronave;
    public String keyAeropuertoOrigen;
    public String keyAeropuertoDestino;
    public Date fecha_salida;
    public Date fecha_arribe;
    public List<Tripulante> listaTripulante;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

package Domain.Model.Vuelos;

import java.util.UUID;

import com.google.gson.Gson;

import SharedKernel.core.Entity;

public class Tripulante extends Entity<UUID> {

    public String nrovuelo;
    public String descripcion; // cargo
    public String nombre; // nombre completo

    public Tripulante(String _nrovuelo, String _descripcion, String _nombre) {
        this.key = UUID.randomUUID();
        this.nrovuelo = _nrovuelo;
        this.descripcion = _descripcion;
        this.nombre = _nombre;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
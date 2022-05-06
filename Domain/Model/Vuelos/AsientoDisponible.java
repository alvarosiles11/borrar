package Domain.Model.Vuelos;

import java.util.UUID;

import com.google.gson.Gson;

import SharedKernel.core.Entity;

public class AsientoDisponible extends Entity<UUID> {

    public String nrovuelo;
    public String matricula;
    public String clase;
    public double precio;
    public String estado;

    public AsientoDisponible(String _nrovuelo, String _matricula, String _clase, double _precio, String _estado) {
        this.key = UUID.randomUUID();
        this.nrovuelo = _nrovuelo;
        this.matricula = _matricula;
        this.clase = _clase;
        this.precio = _precio;
        this.estado = _estado;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
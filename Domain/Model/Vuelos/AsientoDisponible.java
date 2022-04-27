package Domain.Model.Vuelos;

import java.util.UUID;

import com.google.gson.Gson;

import kernel.core.Entity;

public class AsientoDisponible extends Entity<UUID> {

 

    public UUID nrovuelo;
    public String clase;
    public double precio;
    public String estado;


    public AsientoDisponible(UUID nrovuelo, String clase, double precio, String estado) {
        this.nrovuelo = nrovuelo;
        this.clase = clase;
        this.precio = precio;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    // @Override
    // public String toString() {
    // return "\n[ASIENTOS_DISPONIBLES]: Nro: " + Numero + " Clase: " + Clase + " -
    // Precio: " + Precio + "Bs";
    // }
}
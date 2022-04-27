package Domain.Model.Vuelos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;

import kernel.core.Entity;

public class AsientoDisponible extends Entity<UUID> {

    public UUID nrovuelo;
    public String clase;
    public double precio;
    public String estado;

    public List<AsientoDisponible> listaAsiento;

    public AsientoDisponible() {
        listaAsiento = new ArrayList<AsientoDisponible>();
    }

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

    public void AgregarAsientoa(UUID _nroVuelo, Integer _cantidad, String _clase, double _precio) {

        for (int i = 0; i < _cantidad; i++) {
            listaAsiento.add(new AsientoDisponible(_nroVuelo, _clase, 200, "activo"));
            System.out.println( "ASIENTO: Nro: " + _nroVuelo + " Clase: " + _clase + " - Precio: " + _precio + "Bs");
        }
    }

}

package Domain.Model.Vuelos;

import java.util.UUID;

import com.google.gson.Gson;

import ShareKernel.core.Entity;

public class AsientoDisponible extends Entity<UUID> {

    public UUID Key;
    public Gson Asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    public double Precio;
    public String Clase;

    public AsientoDisponible(Gson asiento, String clase, double precio) {
        Key = UUID.randomUUID();
        Precio = precio;
        Clase = clase;
        Asiento = asiento;
    }

    
    @Override
    public String toString() {
        return "\n[ASIENTOS_DISPONIBLES]:  Clase: " + Clase + " - Precio: " + Precio + "Bs - "
                + Asiento.toString();
    }
}
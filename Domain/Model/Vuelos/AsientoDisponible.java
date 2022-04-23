package Domain.Model.Vuelos;

import java.util.UUID;
import kernel.core.Entity;

public class AsientoDisponible extends Entity<UUID> {

    public UUID KeyAeronave;
    public String Numero;
    public double Precio;
    public String Clase;

    public AsientoDisponible(UUID keyAeronave,String numero, String clase, double precio) {
        key = UUID.randomUUID();
        KeyAeronave = keyAeronave;
        Precio = precio;
        Clase = clase;
        Numero = numero;
    }

    @Override
    public String toString() {
        return "\n[ASIENTOS_DISPONIBLES]: Nro: " + Numero + " Clase: " + Clase + " - Precio: " + Precio + "Bs";
    }
}
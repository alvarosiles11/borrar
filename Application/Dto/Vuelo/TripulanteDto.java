package Application.Dto.Vuelo;

import java.util.UUID;

public class TripulanteDto {
    private UUID Key;
    private String Descripcion; // cargo

    public UUID getKey() {
        return Key;
    }

    public void setKey(UUID key) {
        Key = key;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

}

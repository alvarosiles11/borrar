package Application.Dto.Vuelo;

import java.util.UUID;

public class AsientoDisponibleDto {

    private UUID KeyAeronave;
    private String Numero;
    private double Precio;
    private String Clase;

    public UUID getKeyAeronave() {
        return KeyAeronave;
    }

    public void setKeyAeronave(UUID keyAeronave) {
        KeyAeronave = keyAeronave;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String clase) {
        Clase = clase;
    }

}

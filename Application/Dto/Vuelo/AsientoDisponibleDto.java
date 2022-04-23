package Application.Dto.Vuelo;

import java.util.UUID;

import com.google.gson.Gson;

 
public class AsientoDisponibleDto {
    public UUID Key;
    public Gson Asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    public double Precio;
    public String Clase;
}

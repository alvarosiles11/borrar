package Application.Dto.Vuelo;

import java.util.ArrayList;
import java.util.UUID;

public class VueloDto {
    public UUID Key;
    // public String NroVuelo;
    // private Gson Aeronave;
    private ArrayList<TripulanteDto> ListaTripulante;
    private ArrayList<AsientoDisponibleDto> ListaAsiento;
    // private Gson AeropuertoOrigen;
    // private Gson AeropuertoDestino;
    // private Date Fecha_arribe;
    // private Date Fecha_salida;
    // private double Precio;

    public VueloDto() {
        ListaTripulante = new ArrayList<TripulanteDto>();
        ListaAsiento = new ArrayList<AsientoDisponibleDto>();
    }

}

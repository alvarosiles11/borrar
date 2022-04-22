package Domain.Model.Vuelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import Domain.Event.VueloCreado;
import ShareKernel.core.AggregateRoot;

public class Vuelo extends AggregateRoot<UUID> {
    private String CodigoSeguridad;

    public UUID Key;
    private String numeroVuelo;
    private JSONObject aeronave;
    private ArrayList<Tripulante> listaTripulante;
    private ArrayList<AsientoDisponible> listaAsiento;
    private JSONObject aeropuertoOrigen;
    private JSONObject aeropuertoDestino;
    private Date fecha_arribe; // INFO: YYYY-MM-DD HH:MM:SS
    private Date fecha_salida;
    private double precio;

    public void vueloCompletado() {
        var event = new VueloCreado(key, fecha_salida, fecha_arribe, precio);
        addDomainEvent(event);
    }

    public Vuelo(Date fecha_salida, Date fecha_arribe, double precio) {
        Key = UUID.randomUUID();
        this.numeroVuelo = null;// INFO: Solicitar al aeropuerto cuendo se completen los datos requeridos.
        this.aeronave = null;
        this.listaTripulante = new ArrayList<Tripulante>(); // INFO: Luego se asignan tripulantes en el vuelo.
        this.precio = precio;
        this.listaAsiento = crear_acientos_disponibles();
        this.aeropuertoOrigen = null;
        this.aeropuertoDestino = null;
        this.fecha_arribe = fecha_arribe;
        this.fecha_salida = fecha_salida;
        System.out.println("Se a creado un nuevo vuelo");

    }

    public ArrayList<AsientoDisponible> crear_acientos_disponibles() {
        if (this.aeronave == null) {
            System.out.println("No existe una aeronave asignada para crear los asientos disponibles.");
            return null;
        }

        JSONArray asientos_de_aeronave = this.aeronave.getJSONArray("asientos");
        ArrayList<AsientoDisponible> arr = new ArrayList<AsientoDisponible>();
        for (int i = 0; i < asientos_de_aeronave.length(); i++) {
            JSONObject asiento = asientos_de_aeronave.getJSONObject(i);
            arr.add(new AsientoDisponible(asiento, "comercial", this.precio));
        }
        System.out.println("Se crearon los asientos disponibles");
        return arr;
    }

    public void setAeronave(JSONObject aeronave) {
        this.aeronave = aeronave;
        this.listaAsiento = crear_acientos_disponibles();
    }

    public void setAeropuertoOrigen(JSONObject aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public void setAeropuertoDestino(JSONObject aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public void asignarTripulante(Tripulante t) {
        this.listaTripulante.add(t);
    }

    @Override
    public String toString() {
        return "\n[VUELO]: " + this.key + "\n" +
                "[Aeronave]: " + this.aeronave + "\n" +
                "\nTripulantes: " + this.listaTripulante + "\n" +
                "Asientos: " + this.listaAsiento + "\n\n" +
                "[Aeropuerto Origen]: " + this.aeropuertoOrigen + " Itinerario: " + this.fecha_salida + "\n" +
                "[Aeropuerto Destino]: " + this.aeropuertoDestino + " Itinerario: " + this.fecha_arribe + "\n";
    }
}

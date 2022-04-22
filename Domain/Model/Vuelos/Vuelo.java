package Domain.Model.Vuelos;

// import java.security.Key;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import Domain.Event.VueloCreado;
import Domain.Model.Vuelos.ValueObjects.NumeroVuelo;
import ShareKernel.core.AggregateRoot;
import ShareKernel.core.DomainEvent;

public class Vuelo extends AggregateRoot<UUID> {

    public UUID Key;
    public NumeroVuelo NroVuelo;
    private JSONObject Aeronave;
    private ArrayList<Tripulante> ListaTripulante;
    private ArrayList<AsientoDisponible> ListaAsiento;
    private JSONObject AeropuertoOrigen;
    private JSONObject AeropuertoDestino;
    private Date Fecha_arribe;
    private Date Fecha_salida;
    private double Precio;

    public Vuelo(String nroVuelo, Date fecha_salida, Date fecha_arribe, double precio) {
        Key = UUID.randomUUID();
        NroVuelo = new NumeroVuelo(nroVuelo);
        Aeronave = null;
        ListaTripulante = new ArrayList<Tripulante>(); // INFO: Luego se asignan tripulantes en el vuelo.
        Precio = precio;
        ListaAsiento = AgregarAsientosDisponibless();
        AeropuertoOrigen = null;
        AeropuertoDestino = null;
        Fecha_arribe = fecha_arribe;
        Fecha_salida = fecha_salida;
        System.out.println("Se a creado un nuevo vuelo");
    }

    public void AgregarAeronave(JSONObject aeronave) {
        Aeronave = aeronave;
        ListaAsiento = AgregarAsientosDisponibless();
    }

    public ArrayList<AsientoDisponible> AgregarAsientosDisponibless() {
        if (Aeronave == null) {
            System.out.println("No existe una aeronave asignada para crear los asientos disponibles.");
            return null;
        }
        JSONArray asientos_de_aeronave = Aeronave.getJSONArray("asientos");
        ArrayList<AsientoDisponible> arr = new ArrayList<AsientoDisponible>();
        for (int i = 0; i < asientos_de_aeronave.length(); i++) {
            JSONObject asiento = asientos_de_aeronave.getJSONObject(i);
            arr.add(new AsientoDisponible(Key, asiento, "comercial", this.Precio));
        }
        System.out.println("Se crearon los asientos disponibles");
        return arr;
    }

    public void AgregarTripulante(Tripulante t) {
        ListaTripulante.add(t);
    }

    public void AgregarAeropuertoOrigen(JSONObject aeropuertoOrigen) {
        AeropuertoOrigen = aeropuertoOrigen;
    }

    public void AgregarAeropuertoDestino(JSONObject aeropuertoDestino) {
        AeropuertoDestino = aeropuertoDestino;
    }

    public void ConsolidarVuelo() {
        DomainEvent evento = new VueloCreado(Key, Fecha_salida, Fecha_arribe, Precio);
        addDomainEvent(evento);
    }

    @Override
    public String toString() {
        return "\n[VUELO]: " + this.key + "\n" +
                "[Aeronave]: " + this.Aeronave + "\n" +
                "\nTripulantes: " + this.ListaTripulante + "\n" +
                "Asientos: " + this.ListaAsiento + "\n\n" +
                "[Aeropuerto Origen]: " + this.AeropuertoOrigen + " Itinerario: " + this.Fecha_salida + "\n" +
                "[Aeropuerto Destino]: " + this.AeropuertoDestino + " Itinerario: " + this.Fecha_arribe + "\n";
    }
}

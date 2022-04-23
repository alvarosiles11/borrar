package Domain.Model.Vuelos;

// import java.security.Key;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.google.gson.Gson;

 

import Domain.Event.VueloCreado;
import Domain.Model.Vuelos.ValueObjects.NumeroVuelo;
import kernel.core.AggregateRoot;
import kernel.core.DomainEvent;

public class Vuelo extends AggregateRoot<UUID> {

    public UUID Key;
    public NumeroVuelo NroVuelo;
    private Gson Aeronave;
    private ArrayList<Tripulante> ListaTripulante;
    private ArrayList<AsientoDisponible> ListaAsiento;
    private Gson AeropuertoOrigen;
    private Gson AeropuertoDestino;
    private Date Fecha_arribe;
    private Date Fecha_salida;
    private double Precio;

    // ricky
    public Vuelo() {
        key = UUID.randomUUID();

        ListaTripulante = new ArrayList<Tripulante>();
        ListaAsiento = new ArrayList<AsientoDisponible>();
    }

    public Vuelo(Date fecha_salida, Date fecha_arribe, double precio) {
        Key = UUID.randomUUID();
        // NroVuelo = new NumeroVuelo(nroVuelo);
        NroVuelo = null;// INFO: Solicitar al aeropuerto cuendo se completen los datos requeridos.
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

    public void AgregarAeronave(Gson aeronave) {
        Aeronave = aeronave;
        ListaAsiento = AgregarAsientosDisponibless();
    }

    public ArrayList<AsientoDisponible> AgregarAsientosDisponibless() {
        if (Aeronave == null) {
            System.out.println("No existe una aeronave asignada para crear los asientos disponibles.");
            return null;
        }
        JSONArray asientos_de_aeronave = Aeronave.getJSONArray("aeronave");
        System.out.println("Se registro aeronave");

        ArrayList<AsientoDisponible> arr = new ArrayList<AsientoDisponible>();
        for (int i = 0; i < asientos_de_aeronave.length(); i++) {
            Gson asiento = asientos_de_aeronave.getJSONObject(i);
            arr.add(new AsientoDisponible(asiento, "comercial", Precio));
        }
        System.out.println("Se crearon los asientos disponibles");
        return arr;
    }

    public void AgregarTripulante(Tripulante t) {
        ListaTripulante.add(t);
    }

    public void AgregarAeropuertoOrigen(Gson aeropuertoOrigen) {
        AeropuertoOrigen = aeropuertoOrigen;
    }

    public void AgregarAeropuertoDestino(Gson aeropuertoDestino) {
        AeropuertoDestino = aeropuertoDestino;
    }

    public void ConsolidarVuelo() {
        DomainEvent evento = new VueloCreado(Key, Fecha_salida, Fecha_arribe, Precio);
        addDomainEvent(evento);
    }

    @Override
    public String toString() {
        return "\n[VUELO]: " + Key + "\n" +
                "[Aeronave]: " + Aeronave + "\n" +
                "\nTripulantes: " + ListaTripulante+ "\n" +
                "Asientos: " + ListaAsiento + "\n\n" +
                "[Aeropuerto Origen]: " + AeropuertoOrigen + " Itinerario: " + Fecha_salida + "\n" +
                "[Aeropuerto Destino]: " + AeropuertoDestino + " Itinerario: " + Fecha_arribe + "\n";
    }
}

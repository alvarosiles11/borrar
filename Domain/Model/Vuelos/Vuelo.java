package Domain.Model.Vuelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import Domain.Event.VueloCreado;
import Domain.Model.Aeronaves.Aeronave;
import Domain.Model.Aeropuertos.Aeropuerto;
import Domain.Model.Vuelos.ValueObjects.NumeroVuelo;
import kernel.core.AggregateRoot;
import kernel.core.DomainEvent;

public class Vuelo extends AggregateRoot<UUID> {

    public UUID Key;
    public NumeroVuelo NroVuelo;
    private Aeronave _Aeronave;
    private List<Tripulante> ListaTripulante;
    private List<AsientoDisponible> ListaAsiento;
    private Aeropuerto AeropuertoOrigen;
    private Aeropuerto AeropuertoDestino;
    private Date Fecha_arribe;
    private Date Fecha_salida;

    public Vuelo() {
        key = UUID.randomUUID();
        ListaTripulante = new ArrayList<Tripulante>();
        ListaAsiento = new ArrayList<AsientoDisponible>();
    }

    public Vuelo(Date fecha_salida, Date fecha_arribe) {
        Key = UUID.randomUUID();
        // NroVuelo = new NumeroVuelo(nroVuelo);
        NroVuelo = null;// INFO: Solicitar al aeropuerto cuendo se completen los datos requeridos.
        _Aeronave = null;
        ListaTripulante = new ArrayList<Tripulante>(); // INFO: Luego se asignan tripulantes en el vuelo.
        ListaAsiento = new ArrayList<AsientoDisponible>();
        AeropuertoOrigen = null;
        AeropuertoDestino = null;
        Fecha_arribe = fecha_arribe;
        Fecha_salida = fecha_salida;
        System.out.println("Se a creado un nuevo vuelo");
    }

    public void AgregarAeronave(Aeronave aeronave) {
        _Aeronave = aeronave;
    }

    public void AgregarAsientosDisponibles(AsientoDisponible t) {
        ListaAsiento.parallelStream().filter(p -> p.getKey() == t.getKey()).findFirst().ifPresent(p -> {
            throw new RuntimeException("El asiento ya existe");
        });
        ListaAsiento.add(t);
    }

    public void AgregarTripulante(Tripulante t) {
        ListaTripulante.add(t);
    }

    public void AgregarAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        AeropuertoOrigen = aeropuertoOrigen;
    }

    public void AgregarAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        AeropuertoDestino = aeropuertoDestino;
    }

    public void ConsolidarVuelo() {
        DomainEvent evento = new VueloCreado(Key, Fecha_salida, Fecha_arribe);
        addDomainEvent(evento);
    }

    @Override
    public String toString() {
        return "\n[VUELO]: " + Key + "\n" +
                "[Aeronave]: " + _Aeronave.Marca + "\n" +
                "\nTripulantes: " + ListaTripulante + "\n" +
                "Asientos: " + ListaAsiento + "\n\n" +
                "[Aeropuerto Origen]: " + AeropuertoOrigen.Nombre + " Itinerario: " + Fecha_salida + "\n" +
                "[Aeropuerto Destino]: " + AeropuertoDestino.Nombre + " Itinerario: " + Fecha_arribe + "\n";
    }
}

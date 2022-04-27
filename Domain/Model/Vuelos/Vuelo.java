package Domain.Model.Vuelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import Domain.Event.VueloCreado;
import Domain.Model.Aeronaves.Aeronave;
import Domain.Model.Aeropuertos.Aeropuerto;
import kernel.core.AggregateRoot;
import kernel.core.DomainEvent;

public class Vuelo extends AggregateRoot<UUID> {

    public UUID Key;
    // public NumeroVuelo NroVuelo;
    public UUID nroVuelo;
    private Aeronave _Aeronave;
    public List<Tripulante> listaTripulante;
    public List<AsientoDisponible> listaAsiento;
    private Aeropuerto AeropuertoOrigen;
    private Aeropuerto AeropuertoDestino;
    private Date Fecha_arribe;
    private Date Fecha_salida;

    public Vuelo(UUID _nroVuelo, Integer cantidad, String clase) {
        key = UUID.randomUUID();
        nroVuelo = _nroVuelo;

        // NroVuelo = new NumeroVuelo(nroVuelo);
        // listaTripulante = _ListaTripulante;
        // listaAsiento = _ListaAsiento;
    }

    public void AgregarAsiento(UUID _nroVuelo, Integer _cantidad, String _clase, double _precio) {

        for (int i = 0; i < _cantidad; i++) {
            listaAsiento.add(new AsientoDisponible(_nroVuelo, _clase, _precio, "activo"));
        }

    }

    public Vuelo(UUID _nroVuelo, List<Tripulante> _ListaTripulante, List<AsientoDisponible> _ListaAsiento) {
        key = UUID.randomUUID();
        nroVuelo = _nroVuelo;
        // NroVuelo = new NumeroVuelo(nroVuelo);
        listaTripulante = _ListaTripulante;
        listaAsiento = _ListaAsiento;
    }

    public Vuelo(Date fecha_salida, Date fecha_arribe) {
        Key = UUID.randomUUID();
        // NroVuelo = new NumeroVuelo(nroVuelo);
        // NroVuelo = null;// INFO: Solicitar al aeropuerto cuendo se completen los
        // datos requeridos.
        _Aeronave = null;
        listaTripulante = new ArrayList<Tripulante>(); // INFO: Luego se asignan tripulantes en el vuelo.
        listaAsiento = new ArrayList<AsientoDisponible>();
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
        listaAsiento.parallelStream().filter(p -> p.getKey() == t.getKey()).findFirst().ifPresent(p -> {
            throw new RuntimeException("El asiento ya existe");
        });
        listaAsiento.add(t);
    }

    public void AgregarTripulante(Tripulante t) {
        listaTripulante.add(t);
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
                "\nTripulantes: " + listaTripulante + "\n" +
                "Asientos: " + listaAsiento + "\n\n" +
                "[Aeropuerto Origen]: " + AeropuertoOrigen.Nombre + " Itinerario: " + Fecha_salida + "\n" +
                "[Aeropuerto Destino]: " + AeropuertoDestino.Nombre + " Itinerario: " + Fecha_arribe + "\n";
    }
}

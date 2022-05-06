package Domain.Model.Vuelos;

import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;

import Domain.Model.Aeronaves.Aeronave;
import SharedKernel.core.AggregateRoot;

public class Vuelo extends AggregateRoot<UUID> {

    public String nroVuelo;
    // private Aeronave aeronave;
    public List<Tripulante> listaTripulante;
    public List<AsientoDisponible> listaAsiento;
    // private Aeropuerto AeropuertoOrigen;
    // private Aeropuerto AeropuertoDestino;
    // private Date Fecha_arribe;
    // private Date Fecha_salida;

    public Vuelo(String _nroVuelo, List<Tripulante> _ListaTripulante, List<AsientoDisponible> _ListaAsiento) {
        key = UUID.randomUUID();
        nroVuelo = _nroVuelo;
        // aeronave = null;
        listaTripulante = _ListaTripulante;
        listaAsiento = _ListaAsiento;
        // AeropuertoOrigen = null;
        // AeropuertoDestino = null;
        // Fecha_arribe = null;
        // Fecha_salida = null;
        System.out.println("Se a creado un nuevo vuelo");
    }

    // public Vuelo(String _nroVuelo, Date _fecha_salida, Date _fecha_arribe,
    // List<Tripulante> _ListaTripulante, List<AsientoDisponible> _ListaAsiento) {
    // key = UUID.randomUUID();
    // nroVuelo = _nroVuelo;
    // aeronave = null;
    // listaTripulante = _ListaTripulante;
    // listaAsiento = _ListaAsiento;
    // AeropuertoOrigen = null;
    // AeropuertoDestino = null;
    // Fecha_arribe = _fecha_arribe;
    // Fecha_salida = _fecha_salida;
    // System.out.println("Se a creado un nuevo vuelo");
    // }

    // public void AgregarAeronave(Aeronave _aeronave) {
    // aeronave = _aeronave;
    // }

    // public void AgregarAsiento(String _nroVuelo, String _matricula, Integer
    // _cantidad, String _clase, double _precio) {
    // for (int i = 0; i < _cantidad; i++) {
    // listaAsiento.add(new AsientoDisponible(_nroVuelo, _matricula, _clase,
    // _precio, "activo"));
    // }
    // }

    // public void AgregarAsientosDisponibles(AsientoDisponible asiento) {
    // listaAsiento.parallelStream().filter(p -> p.getKey() ==
    // asiento.getKey()).findFirst().ifPresent(p -> {
    // throw new RuntimeException("El asiento ya existe");
    // });
    // listaAsiento.add(asiento);
    // }

    // public void AgregarTripulante(Tripulante tripulante) {
    // listaTripulante.parallelStream().filter(p -> p.getKey() ==
    // tripulante.getKey()).findFirst().ifPresent(p -> {
    // throw new RuntimeException("El tripulante ya existe");
    // });
    // listaTripulante.add(tripulante);
    // }

    // public void AgregarAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
    // AeropuertoOrigen = aeropuertoOrigen;
    // }

    // public void AgregarAeropuertoDestino(Aeropuerto aeropuertoDestino) {
    // AeropuertoDestino = aeropuertoDestino;
    // }

    @Override
    public String toString() {
        return new Gson().toJson(this, Aeronave.class);
    }
}

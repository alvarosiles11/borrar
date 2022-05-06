package Domain.Model.Vuelos;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;

import SharedKernel.core.AggregateRoot;

public class Vuelo extends AggregateRoot<UUID> {

    public String nroVuelo;
    public String keyAeronave;
    public String keyAeropuertoOrigen;
    public String keyAeropuertoDestino;
    public Date fecha_salida;
    public Date fecha_arribe;
    public List<Tripulante> listaTripulante;

    public Vuelo(String _nroVuelo, String _keyAeronave, String _keyAeropuertoOrigen, String _keyAeropuertoDestino, Date fecha_salida2, Date fecha_arribe2, List<Tripulante> _listaTripulante) {
        key = UUID.randomUUID();
        nroVuelo = _nroVuelo;
        keyAeronave = _keyAeronave;
        keyAeropuertoOrigen = _keyAeropuertoOrigen;
        keyAeropuertoDestino = _keyAeropuertoDestino;
        fecha_salida = fecha_salida2;
        fecha_arribe = fecha_arribe2;
        listaTripulante = _listaTripulante;
        System.out.println(new Date().toString());
        System.out.println("Se a creado un nuevo vuelo");
    }

 

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
        return new Gson().toJson(this);
    }

}

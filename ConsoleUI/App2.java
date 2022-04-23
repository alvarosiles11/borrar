package ConsoleUI;

import java.util.Date;

import Domain.Model.Aeronaves.Aeronave;
import Domain.Model.Aeropuertos.Aeropuerto;
import Domain.Model.Vuelos.AsientoDisponible;
import Domain.Model.Vuelos.Tripulante;
import Domain.Model.Vuelos.Vuelo;
import Domain.Model.Vuelos.ValueObjects.NumeroVuelo;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Hola vamos a crear un vuelo!");
        System.out.println("");

        Aeronave aeronave = new Aeronave("Boeing", "777");

        Date fecha_salida = new Date();
        Date fecha_arribe = new Date();
        Vuelo vuelo1 = new Vuelo(fecha_salida, fecha_arribe);

        vuelo1.AgregarAeronave(aeronave);
        vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A1", "Comercial", 750));
        vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A2", "Comercial", 750));
        vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A3", "Comercial", 750));
        vuelo1.AgregarAsientosDisponibles(new AsientoDisponible(aeronave.Key, "A4", "Comercial", 750));

        vuelo1.AgregarTripulante(new Tripulante("Piloto"));
        vuelo1.AgregarTripulante(new Tripulante("Co-Piloto"));
        vuelo1.AgregarTripulante(new Tripulante("Asistente vuelo"));
        vuelo1.AgregarTripulante(new Tripulante("Asistente vuelo auxiliar"));

        vuelo1.AgregarAeropuertoOrigen(new Aeropuerto("Viru-Viru", "Santa cruz"));
        vuelo1.AgregarAeropuertoDestino(new Aeropuerto("san jorge", "La paz"));

        System.out.println(vuelo1.toString());

    }

}
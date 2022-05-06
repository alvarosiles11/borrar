package Domain.Model.Aeropuertos;

import java.util.UUID;

// import ShareKernel.core.AggregateRoot;
import SharedKernel.core.*;

public class Aeropuerto extends AggregateRoot<UUID> {

    // public PersonNameValue NombreCompleto;
    public UUID Key;
    public String Nombre;
    public String Lugar;

    // public PersonNameValue NombreCompleto;
    public Aeropuerto(String nombre, String lugar) {
        Key = UUID.randomUUID();
        Nombre = nombre;
        Lugar = lugar;
        // NombreCompleto = new PersonNameValue(nombre);
    }
}

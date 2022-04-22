package Domain.Model.Aeronaves;

import java.util.UUID;

import ShareKernel.core.AggregateRoot;

public class Aeronave extends AggregateRoot<UUID> {
    public UUID Key;
    public String Marca;
    public String Modelo;

    // public PersonNameValue NombreCompleto;
    public Aeronave(  String marca, String modelo) {
        Key = UUID.randomUUID();
        Marca = marca;
        Modelo = modelo;
        // NombreCompleto = new PersonNameValue(nombre);
    }
}

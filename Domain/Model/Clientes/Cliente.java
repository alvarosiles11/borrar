package Domain.Model.Clientes;

import java.util.UUID;

import ShareKernel.core.AggregateRoot;
import ShareKernel.valueObjects.PersonNameValue;

public class Cliente extends AggregateRoot<UUID> {

    public UUID Id;
    public PersonNameValue NombreCompleto;

    public Cliente(String nombre) {
        Id = UUID.randomUUID();
        NombreCompleto = new PersonNameValue(nombre);
    }
}

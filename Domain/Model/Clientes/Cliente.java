package Domain.Model.Clientes;

import java.util.UUID;

import Domain.ValueObjects.PersonNameValue;
// import ShareKernel.core.AggregateRoot;
// import ShareKernel.valueObjects.PersonNameValue;
import kernel.core.*;
 
public class Cliente extends AggregateRoot<UUID> {

    public UUID Id;
    public PersonNameValue NombreCompleto;

    public Cliente(String nombre) {
        Id = UUID.randomUUID();
        NombreCompleto = new PersonNameValue(nombre);
    }
}

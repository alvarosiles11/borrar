package Domain.Model.Clientes;

import java.util.UUID;

import ShareKernel.core.AggregateRoot;
import ShareKernel.valueObjects.PersonNameValue;

public class Cliente extends AggregateRoot<UUID> {
    
    public PersonNameValue NombreCompleto;
    public UUID Id;
    public Cliente (String nombre){
        Id = UUID.randomUUID();
        NombreCompleto = new PersonNameValue(nombre);

    }
}

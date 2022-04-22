package Domain.Model.Vuelos;

import java.util.UUID;

import Domain.Event.VueloCreado;
import ShareKernel.core.AggregateRoot;

public class Vuelo extends AggregateRoot<UUID>{
    private String CodigoSeguridad;

    public Vuelo(String codigoSeguridad){
        key = UUID.randomUUID();
        this.CodigoSeguridad = codigoSeguridad;
         
    }
    
    public void vueloCompletado(){
        var event = new VueloCreado(key, CodigoSeguridad);
        addDomainEvent(event);
    }
}

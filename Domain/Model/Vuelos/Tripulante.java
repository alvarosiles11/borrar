package Domain.Model.Vuelos;

import java.util.UUID;

import com.google.gson.Gson;

// import kernel.core.AggregateRoot;
import kernel.core.Entity;
 
public class Tripulante extends Entity<UUID> {

     public String descripcion; // cargo

    

    public Tripulante(String _descripcion) {
        this.key = UUID.randomUUID();
        this.descripcion = _descripcion;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

 

    // @Override
    // public String toString() {
    //     return "\n[TRIPULANTE]: Key: " + Key + " Cargo" + Cargo;
    // }

 
    
}

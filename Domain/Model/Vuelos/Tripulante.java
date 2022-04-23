package Domain.Model.Vuelos;

import java.util.UUID;
import kernel.core.Entity;

public class Tripulante extends Entity<UUID> {

    public UUID Key;
    public String Cargo; // cargo

    public Tripulante(String cargo) {
        Key = UUID.randomUUID();
        Cargo = cargo;
    }

    @Override
    public String toString() {
        return "\n[TRIPULANTE]: Key: " + Key + " Cargo" + Cargo;
    }

}

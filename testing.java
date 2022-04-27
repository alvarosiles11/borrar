import java.util.UUID;

import Domain.Model.Vuelos.AsientoDisponible;

public class testing {

 
    public static void main(String[] args) {

        AsientoDisponible asiento = new AsientoDisponible();
        asiento.AgregarAsientoa(UUID.randomUUID(), 5, "Super Eco", 250);
        asiento.AgregarAsientoa(UUID.randomUUID(), 10, "Eco", 450);
        asiento.AgregarAsientoa(UUID.randomUUID(), 15, "Flex", 750);

        // INFO: RECORRE LOS ASIENTOS DISPONIBLES
        // for (int i = 0; i < asiento.listaAsiento.size(); i++) {
        //     System.out.println("clase: " + asiento.listaAsiento.get(i).clase + " Precio: "
        //             + asiento.listaAsiento.get(i).precio + "Bs");
        // }

        // INFO: RECORRE LOS ASIENTOS DISPONIBLES
        // System.out.println("Total asiento: " + asiento.listaAsiento.size());
        // System.out.println("Asientos Super Eco: "
        //         + asiento.listaAsiento.parallelStream().filter(predicate -> predicate.clase.equals("Super Eco")).count());
        
        // INFO: RECORRE LOS ASIENTOS DE CLASE ECO
        // System.out.println("Asientos Eco: "
        //         + asiento.listaAsiento.parallelStream().filter(predicate -> predicate.clase.equals("Eco")).count());
        // System.out.println("Asientos Flex: "
        //         + asiento.listaAsiento.parallelStream().filter(predicate -> predicate.clase.equals("Flex")).count());

       
 
         
    }
}

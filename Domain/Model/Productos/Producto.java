package Domain.Model.Productos;

import java.util.UUID;

import Domain.Model.ValueObjects.CantidadValue;
import Domain.ValueObjects.PrecioValue;
import ShareKernel.core.AggregateRoot;

public class Producto extends AggregateRoot<UUID>{
    
    public UUID Id ;
    public String Nombre ;
    public PrecioValue PrecioVenta;
    public CantidadValue StockActual;


    public Producto (String nombre, double precio, Integer cantidad){
        Id= UUID.randomUUID();
        Nombre = nombre;
        PrecioVenta = new PrecioValue(precio);
        StockActual = new CantidadValue(cantidad);
    }

}

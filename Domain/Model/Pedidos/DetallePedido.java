package Domain.Model.Pedidos;

import java.util.UUID;

import Domain.Model.ValueObjects.CantidadValue;
import Domain.ValueObjects.PrecioValue;
import ShareKernel.core.Entity;

public class DetallePedido extends Entity<UUID> {

    public UUID Id;
    public UUID ProductoId;
    public String Instrucciones;
    public CantidadValue Cantidad;
    public PrecioValue Precio;
    public PrecioValue Subtotal;

    public DetallePedido(UUID id, String instrucion, Integer cantidad, PrecioValue precio) {
        Id = id;
        Instrucciones = instrucion;
        Cantidad = new CantidadValue(cantidad);
        Precio = precio;
        Subtotal =new PrecioValue(cantidad);
        //esta mal el subtotal
    }

    public void ModificarPedido(Integer cantidad, double precio) {
        Cantidad = new CantidadValue(cantidad);
        Precio = new PrecioValue(precio);
        Subtotal = new PrecioValue(precio * cantidad);
    }

}

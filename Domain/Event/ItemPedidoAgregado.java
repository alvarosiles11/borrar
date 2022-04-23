package Domain.Event;

 import java.util.Date;
import java.util.UUID;

import Domain.ValueObjects.CantidadValue;
import Domain.ValueObjects.PrecioValue;
// import ShareKernel.core.DomainEvent;
import kernel.core.*;

public class ItemPedidoAgregado extends DomainEvent {

    public UUID ProductoId;
    public PrecioValue Precio;
    public CantidadValue Cantidad;

    public ItemPedidoAgregado(UUID productoId, PrecioValue precio,CantidadValue cantidad) {
        super(new Date());
        ProductoId = productoId;
        Precio = precio;
        Cantidad = cantidad;
    }

}
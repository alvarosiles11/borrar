package Domain.Event;

import java.time.LocalDateTime;
import java.util.UUID;

import Domain.ValueObjects.CantidadValue;
import Domain.ValueObjects.PrecioValue;
import ShareKernel.core.DomainEvent;

public class ItemPedidoAgregado extends DomainEvent {

    public UUID ProductoId;
    public PrecioValue Precio;
    public CantidadValue Cantidad;

    public ItemPedidoAgregado(UUID productoId, PrecioValue precio,CantidadValue cantidad) {
        super(LocalDateTime.now());
        ProductoId = productoId;
        Precio = precio;
        Cantidad = cantidad;
    }

}
package Domain.Model.Pedidos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import Domain.Event.PedidoCreado;
import Domain.Model.Pedidos.ValueObjects.NumeroPedido;
import Domain.ValueObjects.PrecioValue;
import ShareKernel.core.AggregateRoot;
import ShareKernel.core.DomainEvent;

public class Pedido extends AggregateRoot<UUID> {

    public UUID Id;
    public UUID clienteId;
    public NumeroPedido NroPedido;
    public PrecioValue Total;
    public ArrayList<DetallePedido> Detalle;

    public Pedido(String nroPedido) {
        Id = UUID.randomUUID();
        // NroPedido =nroPedido;
        NroPedido = new NumeroPedido(nroPedido);
        Total = new PrecioValue(0);
        Detalle = new ArrayList<DetallePedido>();

    }

    public void AgregarItem (UUID productoId, int cantidad, PrecioValue precio, String inatruccion){
        ArrayList<DetallePedido> uax=Detalle;
        // ArrayList<DetallePedido> uax=Detalle.stream().findFirst((Detalle)->DetallePedido.productoId()==productoId) ;


        if (uax==null){
            DetallePedido   detallePedido = new DetallePedido(productoId, inatruccion, cantidad, precio);
            Detalle.add(detallePedido);
         } 
        //  me falta modificar el pedido
    }

    public void ConsolidarPedido() {
        DomainEvent evento = new PedidoCreado(Id, NroPedido);
        addDomainEvent(evento);
    }
}

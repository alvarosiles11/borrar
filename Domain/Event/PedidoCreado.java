package Domain.Event;

 import java.util.Date;
import java.util.UUID;

import Domain.Model.Pedidos.ValueObjects.NumeroPedido;
// import ShareKernel.core.DomainEvent;
import kernel.core.*;

public class PedidoCreado extends DomainEvent {

    public UUID Key;
    public NumeroPedido NroPedido;

    public PedidoCreado(UUID key, NumeroPedido nro) {
        super(new Date());
        Key = key;
        NroPedido = nro;
    }

}
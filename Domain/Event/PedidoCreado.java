package Domain.Event;

import java.time.LocalDateTime;
import java.util.UUID;

import Domain.Model.Pedidos.ValueObjects.NumeroPedido;
import ShareKernel.core.DomainEvent;

public class PedidoCreado extends DomainEvent {

    public UUID Key;
    public NumeroPedido NroPedido;

    public PedidoCreado(UUID key, NumeroPedido nro) {
        super(LocalDateTime.now());
        Key = key;
        NroPedido = nro;
    }

}
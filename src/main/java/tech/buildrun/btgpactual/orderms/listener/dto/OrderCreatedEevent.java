package tech.buildrun.btgpactual.orderms.listener.dto;

import java.util.List;

public record OrderCreatedEevent(Long codigoPedido,
                                 Long codigoCliente,
                                 List<OrderItemEvent> itens) {
}

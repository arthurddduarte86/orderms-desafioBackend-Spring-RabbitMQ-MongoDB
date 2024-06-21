package tech.buildrun.btgpactual.orderms.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import tech.buildrun.btgpactual.orderms.listener.dto.OrderCreatedEevent;

import static tech.buildrun.btgpactual.orderms.config.RabbitMQConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEevent> message) {
        logger.info("Message consumed: {}", message);
    }

}

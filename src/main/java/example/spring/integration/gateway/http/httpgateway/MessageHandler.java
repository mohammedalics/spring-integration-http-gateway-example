package example.spring.integration.gateway.http.httpgateway;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * The Class MessageHandler.
 */
@Component
public class MessageHandler {

    /**
     * Handle message.
     *
     * @param message the message
     * @return the message
     */
    @ServiceActivator
    public Message handleMessage(RequestEntity entity) {
        System.out.println(entity.getText()); 
        return MessageBuilder.withPayload(entity.getText()).build();
    }
}
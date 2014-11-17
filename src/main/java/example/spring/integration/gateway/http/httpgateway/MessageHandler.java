package example.spring.integration.gateway.http.httpgateway;

import org.springframework.integration.annotation.ServiceActivator;
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
    public Message handleMessage(Message<?> message) {
        System.out.println("Http Gateway Message: " + message);
        return message;
    }
}
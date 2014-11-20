package example.spring.integration.gateway.http.httpgateway.transformer;

import org.junit.runner.Request;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import example.spring.integration.gateway.http.httpgateway.RequestEntity;

@Component
public class HttpTransformer {
	
	@Transformer
	public RequestEntity transform(Message<?> message) {
		return new RequestEntity(message.getPayload().toString());
	}
	

}

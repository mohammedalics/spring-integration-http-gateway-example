package example.spring.integration.gateway.http.httpgateway;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import example.spring.integration.gateway.http.httpgateway.RequestGateway;


/**
 * Unit test.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/META-INF/spring/integration/http-outbound-config.xml")
public class HttpOutboundRequestTest 
{
    
	/** The application context. */
	@Autowired
    private ApplicationContext applicationContext;  
	
	/**
	 * Test http outbound request.
	 */
	@Test
    public void testHttpOutboundRequest()
    {
		RequestGateway requestGateway = applicationContext.getBean("requestGateway", RequestGateway.class);
		String reply = requestGateway.echo("Hello");
		Assert.hasText(reply, "Hello");
	}
}

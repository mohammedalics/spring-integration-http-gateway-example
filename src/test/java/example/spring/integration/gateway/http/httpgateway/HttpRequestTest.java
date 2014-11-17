package example.spring.integration.gateway.http.httpgateway;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Unit test.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/META-INF/spring/integration/http-outbound-config.xml")
public class HttpRequestTest {

	/**
	 * Test http request.
	 */
	@Test
	public void testHttpRequest() {
		try {
			URL url = new URL("http://localhost:8080/http/receiveGateway");
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "text/plain");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			OutputStreamWriter out = new OutputStreamWriter(
					connection.getOutputStream());
			out.write("Hello");
			out.flush();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String reply = in.readLine();
			Assert.hasText(reply, "Hello");
			in.close();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
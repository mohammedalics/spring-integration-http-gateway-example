
package example.spring.integration.gateway.http.httpgateway;


/**
 * The Interface RequestGateway.
 */
public interface RequestGateway {

	/**
	 * Echo.
	 *
	 * @param request the request
	 * @return the string
	 */
	String echo(String request);

}

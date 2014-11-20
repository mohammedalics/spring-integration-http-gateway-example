package example.spring.integration.gateway.http.httpgateway;

/**
 * 
 *
 */
public class RequestEntity {
	
	private String text; 
	
	public RequestEntity() {
		text = new String(); 
	}
	
	public RequestEntity(String text) {
		this.text = text; 
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

}

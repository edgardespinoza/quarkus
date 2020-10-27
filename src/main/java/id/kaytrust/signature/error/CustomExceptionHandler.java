package id.kaytrust.signature.error;

import javax.json.bind.JsonbBuilder;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import id.kaytrust.signature.response.HttpResponse;
import lombok.extern.slf4j.Slf4j;

@Provider
@Slf4j
public class CustomExceptionHandler implements ExceptionMapper<GlobalException> {
	
	@Override
	public Response toResponse(GlobalException exception) {
		
		HttpResponse<String> response = new HttpResponse<>(exception.getStatus().getStatusCode());
		response.setError(exception.getMessage());
		
		log.warn("WARN.response {}", JsonbBuilder.create().toJson(response));
		
		return Response.status(exception.getStatus()).entity(response).build();
	}
}
package id.kaytrust.signature.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionHandler implements ExceptionMapper<GlobalException> {
	
	@Override
	public Response toResponse(GlobalException exception) {
		return Response.status(exception.getStatus()).entity(new GeneralErrorResponse(exception.getStatus().getStatusCode(), exception.getMessage())).build();
	}
}
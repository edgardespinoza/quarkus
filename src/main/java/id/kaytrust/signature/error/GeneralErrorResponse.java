package id.kaytrust.signature.error;

import id.kaytrust.signature.response.HttpResponse;

public class GeneralErrorResponse extends HttpResponse<String> {

	public GeneralErrorResponse(int status, String error) {
		super(status);
		this.setError(error);
	}

}

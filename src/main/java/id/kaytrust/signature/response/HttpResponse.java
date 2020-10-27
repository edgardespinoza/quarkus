package id.kaytrust.signature.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@RegisterForReflection
public class HttpResponse<T> implements java.io.Serializable {

	private static final long serialVersionUID = -1L;
	private int status;
	private T data;
	private String error;

	public HttpResponse(int status, T data) {
		this.status = status;
		this.data = data;
		// this.message = message;
	}

	public HttpResponse(int status) {
		this.status = status;
	}

}
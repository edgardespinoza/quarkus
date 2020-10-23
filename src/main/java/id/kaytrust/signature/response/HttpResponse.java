package id.kaytrust.signature.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public  class HttpResponse<T> {
	
	 private int status;
	 private T data;
	 private String error;
	 
	 public HttpResponse(int status, T data){
		 this.status = status;
		 this.data = data;
	//	 this.message = message;
	 }
	
	 public HttpResponse(int status) { this.status = status;}

}
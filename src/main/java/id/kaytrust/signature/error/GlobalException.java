package id.kaytrust.signature.error;

import java.io.Serializable;

import javax.ws.rs.core.Response.Status;

import lombok.Getter;

@Getter
public class GlobalException extends Exception implements Serializable {

	private static final long serialVersionUID = 2329765667676467946L;

	private Status status;

	public GlobalException( Status status,String error) {
		super(error);
		this.status = status;
	}

}
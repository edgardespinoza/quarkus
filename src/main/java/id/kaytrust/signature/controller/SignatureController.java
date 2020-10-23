package id.kaytrust.signature.controller;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import id.kaytrust.signature.response.HttpResponse;
import id.kaytrust.signature.service.SignatureService;

@Path("/api/signature")
@RequestScoped
public class SignatureController {

	@Inject
	SignatureService service;


	@GET
	@Path("/greeting/{name}")
	@Produces(APPLICATION_JSON)
	@Consumes(APPLICATION_JSON)
	public Response greeting(@PathParam String name) {
		return Response.ok(new HttpResponse<String>(Status.OK.getStatusCode(), service.greeting(name))).build();
	}
}
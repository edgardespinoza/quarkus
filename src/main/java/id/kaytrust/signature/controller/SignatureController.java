package id.kaytrust.signature.controller;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import id.kaytrust.signature.response.HttpResponse;
import id.kaytrust.signature.service.SignatureService;
import lombok.extern.slf4j.Slf4j;

@Path("/api/signature")
@RequestScoped
@Slf4j
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class SignatureController {

	@Inject
	SignatureService service;

	@GET
	@Path("/greeting/{name}")
	public Response greeting(@PathParam String name) {
		log.info("request.greeting:{}", name);

		String res = service.greeting(name);

		HttpResponse<String> rspService = new HttpResponse<>(Status.OK.getStatusCode(), res);

		log.info("response {}", JsonbBuilder.create().toJson(rspService));

		return Response.ok(rspService).build();
	}
}
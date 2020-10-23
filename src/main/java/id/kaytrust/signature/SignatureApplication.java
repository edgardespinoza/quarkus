package id.kaytrust.signature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@ApplicationPath("/")
@OpenAPIDefinition(
    info = @Info(title = "KAYTRUST-ID",
        description = "Digital Signature ",
        version = "1.0")

)
public class SignatureApplication extends Application{
	
}
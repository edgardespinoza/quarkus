package id.kaytrust.signature.service.impl;

import javax.enterprise.context.ApplicationScoped;

import id.kaytrust.signature.service.SignatureService;

@ApplicationScoped
public class SignatureServiceImpl implements SignatureService {
	
	@Override
	public String greeting(String name) {
        return "hello " + name;
    }
}

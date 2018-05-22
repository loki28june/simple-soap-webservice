package com.loki.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HelloWorld {
	
	@WebMethod
	public String getHelloWorldAsString(@WebParam(name="username")String username);
}

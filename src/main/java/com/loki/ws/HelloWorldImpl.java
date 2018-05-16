package com.loki.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.loki.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello Welcome to JAX-WS " + name;
	}

}

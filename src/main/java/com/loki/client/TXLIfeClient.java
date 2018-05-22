package com.loki.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.loki.ws.HelloWorld;

public class TXLIfeClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
		
		  //1st argument service namespace URI, refer to wsdl document
		//2nd argument is service name, refer to wsdl document
		QName qname = new QName("http://ACORD.org/Standards/Life/2" , "TxlifeService");
		Service service = Service.create(url, qname);
		HelloWorld hello = service.getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString("Lokesh nandanwar"));
	}
}

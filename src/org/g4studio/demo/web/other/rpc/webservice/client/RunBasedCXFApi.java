package org.g4studio.demo.web.other.rpc.webservice.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.g4studio.demo.web.other.rpc.webservice.HelloWorldService;

public class RunBasedCXFApi {
	
	public static void main(String[] args) {
		sayHello();
		queryBalanceInfo();
	}

	private static void sayHello() {
		JaxWsProxyFactoryBean j = new JaxWsProxyFactoryBean();
		j.setAddress("http://127.0.0.1:8899/G4Studio/esb/webservice/HelloWorldService");
		j.setServiceClass(HelloWorldService.class);
		HelloWorldService hw = (HelloWorldService) j.create();
		System.out.println(hw.sayHello("Lily"));
	}

	private static void queryBalanceInfo() {
	   JaxWsProxyFactoryBean j = new JaxWsProxyFactoryBean();
		j.setAddress("http://127.0.0.1:8899/G4Studio/esb/webservice/HelloWorldService");
		j.setServiceClass(HelloWorldService.class);
		HelloWorldService client = (HelloWorldService) j.create();
		String outXmlString = client.queryBalanceInfo("BJLK1000000003900");
		System.out.println(outXmlString);
	}
}

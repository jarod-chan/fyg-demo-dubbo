package com.fyg.demo;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String str) {
		System.out.println("service receive message:"+str);
		return "echo: "+str;
	}

}

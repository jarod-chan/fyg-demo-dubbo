package com.fyg.demo;

/**
 * Hello world!
 *
 */
public class Client 
{
    private HelloService helloService;

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
    
	public void run() throws Exception{
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String str="world"+i;
			try{
				helloService.sayHello(str);
			}catch(Exception e){
				e.printStackTrace();
			}
			Thread.sleep(2000);
		}
	}
    
}

package designPattern.structural.proxy;

import org.junit.Test;


public class ProxyTest {

	@Test
	public void test(){
		Sourceable source = new Proxy();
		source.method();
	}
}

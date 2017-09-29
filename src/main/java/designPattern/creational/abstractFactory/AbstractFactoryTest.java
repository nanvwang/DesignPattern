package designPattern.creational.abstractFactory;

import org.junit.Test;


public class AbstractFactoryTest {

	@Test
	public void test(){
		Provider provider = new SendMailFactory();
		provider.produce().send();
		System.out.println("----------------");
		provider = new SendSmsFactory();
		provider.produce().send();
	}
}

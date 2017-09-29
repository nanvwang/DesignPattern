package designPattern.creational.factory;

import org.junit.Test;


public class FactoryTest {

	@Test
	public void test(){
		SendFactory factory = new SendFactory();
		factory.produce("mail").send();
		System.out.println("----------------");
		factory.produce("sms").send();
	}
	
	@Test
	public void test2(){
		SendFactory2 factory = new SendFactory2();
		factory.produceMail().send();
		System.out.println("----------------");
		factory.produceSms().send();
	}
	
	@Test
	public void test3(){
		SendFactory3.produceMail().send();
		System.out.println("----------------");
		SendFactory3.produceSms().send();
	}
}

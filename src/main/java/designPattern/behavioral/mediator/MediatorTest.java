package designPattern.behavioral.mediator;

import org.junit.Test;


public class MediatorTest {

	@Test
	public void test(){
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}

package designPattern.behavioral.observer;

import org.junit.Test;


public class ObserverTest {

	@Test
	public void test(){
		AbstractSubject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.update();
	}
}

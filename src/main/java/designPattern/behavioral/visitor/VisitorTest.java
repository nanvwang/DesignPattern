package designPattern.behavioral.visitor;

import org.junit.Test;


public class VisitorTest {

	@Test
	public void test(){
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
	}
}

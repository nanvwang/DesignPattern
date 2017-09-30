package designPattern.behavioral.interpreter;

import org.junit.Test;


public class InterpreterTest {

	@Test
	public void test(){
		Context context = new Context(4, 7);
		int plusResult = new Plus().interpret(context);
		System.out.println("Plus in Context:"+plusResult);
		int minusResult = new Minus().interpret(context);
		System.out.println("Minus in Context:"+minusResult);
	}
}

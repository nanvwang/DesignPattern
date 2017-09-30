package designPattern.behavioral.state;

import org.junit.Test;


public class StateTest {

	@Test
	public void test(){
		State state = new State();
		Context context = new Context(state);
		state.setValue("state1");
		System.out.println("状态1：");
		context.method();
		state.setValue("state2");
		System.out.println("状态2：");
		context.method();
	}
}

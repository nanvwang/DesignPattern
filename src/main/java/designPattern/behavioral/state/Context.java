package designPattern.behavioral.state;

public class Context {

	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void method(){
		if("state1".equals(state.getValue())){
			this.state.method1();
		}else if("state2".equals(state.getValue())){
			this.state.method2();
		}
	}
}

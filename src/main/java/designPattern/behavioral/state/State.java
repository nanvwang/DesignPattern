package designPattern.behavioral.state;

public class State {

	private String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void method1(){
		System.out.println("method1 in State");
	}

	public void method2(){
		System.out.println("method2 in State");
	}
}

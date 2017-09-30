package designPattern.structural.adapter;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("method in Adapter!");
	}

}

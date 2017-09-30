package designPattern.structural.adapter;

public class Adapter2 implements Targetable {
	
	private Source source;

	public Adapter2(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("method in Adapter2!");
	}
}

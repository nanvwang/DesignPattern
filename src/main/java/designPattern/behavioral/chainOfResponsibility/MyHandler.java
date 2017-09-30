package designPattern.behavioral.chainOfResponsibility;

public class MyHandler extends AbstractHandler implements Handler {

	private String name;
	
	public MyHandler(String name) {
		super();
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name+" deal");
		Handler handler = getHandler();
		if(handler != null){
			handler.operator();
		}
	}
}

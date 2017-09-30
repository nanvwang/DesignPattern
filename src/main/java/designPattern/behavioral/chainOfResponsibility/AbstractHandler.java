package designPattern.behavioral.chainOfResponsibility;

public abstract class AbstractHandler {

	private Handler handler;

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Handler getHandler() {
		return handler;
	}
}

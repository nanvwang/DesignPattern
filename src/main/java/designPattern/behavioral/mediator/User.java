package designPattern.behavioral.mediator;

public abstract class User {

	private Mediator mediator;

	public Mediator getMediator() {
		return this.mediator;
	}

	public User(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public abstract void work();
}

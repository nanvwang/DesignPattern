package designPattern.behavioral.mediator;

public class MyMediator implements Mediator {

	private User user1;
	private User user2;
	
	@Override
	public void createMediator() {
		this.user1 = new User1(this);
		this.user2 = new User2(this);
	}

	public User getUser1() {
		return this.user1;
	}

	public User getUser2() {
		return this.user2;
	}

	@Override
	public void workAll() {
		this.user1.work();
		this.user2.work();
	}
}

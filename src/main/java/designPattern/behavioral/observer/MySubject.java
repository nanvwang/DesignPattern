package designPattern.behavioral.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void update(){
		System.out.println("update in MySubject");
		notifyObservers();
	}
}

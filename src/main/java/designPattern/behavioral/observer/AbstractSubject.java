package designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void add(Observer obs){
		observers.add(obs);
	}
	
	public void del(Observer obs){
		observers.remove(obs);
	}
	
	public void notifyObservers(){
		for(Observer obs : observers){
			obs.update();
		}
	}
	
	public abstract void update();
}

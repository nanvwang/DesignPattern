package designPattern.behavioral.memento;

public class Original {

	private String value;

	public Original(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento createMemento(){
		return new Memento(this.value);
	}
	
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}
}

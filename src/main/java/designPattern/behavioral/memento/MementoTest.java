package designPattern.behavioral.memento;

import org.junit.Test;


public class MementoTest {

	@Test
	public void test(){
		Original origin = new Original("egg");
		Storage storage = new Storage(origin.createMemento());
		
		System.out.println("初始值："+origin.getValue());
		origin.setValue("bird");
		System.out.println("修改后："+origin.getValue());
		origin.restoreMemento(storage.getMemento());
		System.out.println("恢复后："+origin.getValue());
	}
}

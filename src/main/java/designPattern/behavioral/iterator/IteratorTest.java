package designPattern.behavioral.iterator;

import org.junit.Test;


public class IteratorTest {

	@Test
	public void test(){
		Collection<String> collection = new MyCollection<String>();
		Iterator<String> it = collection.iterator();
		
		collection.add("A");
		collection.add("B");
		collection.add("C");
		collection.add("D");
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

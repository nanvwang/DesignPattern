package designPattern.structural.adapter;

import org.junit.Test;


public class AdapterTest {
	@Test
	public void test(){
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		
		Targetable target2 = new Adapter2(new Source());
		target2.method1();
		target2.method2();
		
		Targetable target3 = new Adapter3Sub();
		target3.method1();
		target3.method2();
	}
}

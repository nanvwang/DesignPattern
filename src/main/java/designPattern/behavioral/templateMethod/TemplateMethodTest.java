package designPattern.behavioral.templateMethod;

import org.junit.Test;


public class TemplateMethodTest {

	@Test
	public void test(){
		String exp = "4+7";
		AbstractCalculator cal = new Plus();
		System.out.println(exp+"="+cal.calculate(exp, "\\+"));
		
		exp = "4-7";
		cal = new Minus();
		System.out.println(exp+"="+cal.calculate(exp, "-"));
	}
}

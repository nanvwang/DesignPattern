package designPattern.behavioral.strategy;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void test() {
		String exp = "4+7";
		ICalculator cal = new Plus();
		System.out.println(exp + "=" + cal.calculate(exp));

		exp = "4-7";
		cal = new Minus();
		System.out.println(exp + "=" + cal.calculate(exp));
	}
}

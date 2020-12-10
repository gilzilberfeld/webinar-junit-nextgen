package testingil.webinars.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex_1_JUnit4Test {

	@Test
	public void vintage_embarassing_test() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.add(2, 3));
	}

}

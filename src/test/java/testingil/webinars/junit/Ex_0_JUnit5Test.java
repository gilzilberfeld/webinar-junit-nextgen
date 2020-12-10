package testingil.webinars.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class Ex_0_JUnit5Test {

	@Test
	void an_embarassing_test() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.add(2, 3));
	}

}

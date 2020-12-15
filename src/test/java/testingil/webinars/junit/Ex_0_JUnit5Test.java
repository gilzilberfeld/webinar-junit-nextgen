package testingil.webinars.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex_0_JUnit5Test {

	@Test
	void an_embarassing_test() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(5, calc.add(2, 3));
	}

}

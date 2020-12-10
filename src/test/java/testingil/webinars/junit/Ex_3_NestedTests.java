package testingil.webinars.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class Ex_3_NestedTests {

	private Calculator calc;

	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}

	@Nested
	public class EmbarassingTests {
		@Test
		void an_embarassing_test() {
			assertThat(calc.add(2, 3), is(5));
		}
	}

	@Nested
	public class HumiliatingTests {
		@Test
		void a_humiliating_test() {
			assertThat(calc.add(4, 6), is(10));
		}
	}

	@Disabled
	@Test
	void passive_agressive_test() {
		fail("I'm not going along with this.");
	}

}

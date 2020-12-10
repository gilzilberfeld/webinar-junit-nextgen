package testingil.webinars.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class Ex_4_ConditionalTests {
	private Calculator calc;

	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}

	@Test
	@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_13)
	@DisplayName("So glad your family ain't around to see this")
	void an_embarassing_test() {
		assertThat(calc.add(2, 3), is(5));
	}

	@Test
	@EnabledOnOs(OS.LINUX)
	@DisplayName("Think of the children...")
	void a_humilating_test() {
		assertThat(calc.add(4, 6), is(10));
	}

}

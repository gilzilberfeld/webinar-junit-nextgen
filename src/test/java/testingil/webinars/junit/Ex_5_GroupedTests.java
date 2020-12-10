package testingil.webinars.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_5_GroupedTests {

	private Calculator calc;

	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}

	@Test
	@DisplayName("You're showing those tests to ")
	void an_embarassing_test() {
		Assertions.assertAll("real people?", 
				() -> assertThat(calc.add(2, 3), is(5)),
				() -> assertThat(calc.add(1, 4), is(5)));
	}

	@Test
	@DisplayName("What would your mother say?")
	void a_humilating_test() {
		Assertions.assertAll("This would make her cry", 
				() -> assertThat(calc.add(2, 3), is(not(6))),
				() -> Assertions.assertDoesNotThrow(() -> calc.add(8, 9)));
	}

}

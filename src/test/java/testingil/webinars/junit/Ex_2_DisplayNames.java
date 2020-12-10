package testingil.webinars.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_2_DisplayNames {

	@Test
	@DisplayName("A Better Name, But still...")
	void an_embarassing_test() {
		Calculator calc = new Calculator();
		assertThat(calc.add(2, 3), is(5));
	}

}

package testingil.webinars.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class Ex_B_RepeatedTests {
	private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}
	
	@ParameterizedTest
	@CsvSource({"1, 2, 3", 
				"2, 4, 6",
				"3, 6, 9"}) 
	void multi_emberassing_test(int a, int b, int expected) {
		String error = "I'm sorry! ";
		assertThat(error, calc.add(a, b), is(expected));
	}
	
	
	@RepeatedTest(3)
	void repeateadly_humiliating_test(RepetitionInfo rep) {
		int current = rep.getCurrentRepetition();
		String error = "Sorry for the " + current +" time"; 
		assertThat(error, calc.add(2,current ), lessThan (10)); 
	 
	}
}

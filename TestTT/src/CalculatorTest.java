import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(30, calculator.sum(10,20));
	}

}

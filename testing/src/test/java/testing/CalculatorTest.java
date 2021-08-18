package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator cal;
	@BeforeEach
	public void init() {
		cal = new Calculator();
	}
	
	@Test
	void test() {
		// fail("Not yet implemented");
		
		int result = cal.add(1, 3);
		assertEquals(4, result);
	}

	@Test
	void testAddFloat() {
		// fail("Not yet implemented");
		Calculator cal = new Calculator();

		float resultFloat = cal.add(1.2f, 3.2f);
		assertEquals(4.4, resultFloat, 0.199999809265138);
	}

	@Test
	void testAddNegative() {
	
		int result = cal.add(3, -5);
		assertEquals(-2, result);

	}

	@Test
	void testDivide() {
		
		double result = cal.divide(4, 2);
		assertEquals(2, result);
	}

	@Test
	void testDivideZero() {
		
		try {
			cal.divide(4, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class,e.getClass());
		}
	}
	
	@Test
	void testAddFloatIf() {
		float result = cal.add(3.0F, 5.0F);
		assertEquals(8, result);
	}
}

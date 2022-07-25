package xie.stanley.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar result = five.times(2);
		assertEquals(new Dollar(10), result);
		
		result = five.times(3);
		assertEquals(new Dollar(15), result);
	}

	@Test
	void testEquality() {
		assertEquals(new Dollar(5), new Dollar(5));
		assertNotEquals(new Dollar(5), new Dollar(8));
	}
}

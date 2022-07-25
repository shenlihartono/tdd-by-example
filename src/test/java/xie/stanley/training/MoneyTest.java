package xie.stanley.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar result = five.times(2);
		assertEquals(10, result.amount);
		
		result = five.times(3);
		assertEquals(15, result.amount);
	}

	@Test
	void testEquality() {
		assertEquals(new Dollar(5), new Dollar(5));
		assertNotEquals(new Dollar(5), new Dollar(8));
	}
}

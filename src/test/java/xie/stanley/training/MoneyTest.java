package xie.stanley.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar result = five.times(2);
		assertEquals(10, result.amount);
		
		result = five.times(3);
		assertEquals(15, result.amount);
	}
}

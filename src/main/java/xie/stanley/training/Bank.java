package xie.stanley.training;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	private final Map<Pair, Integer> rates = new HashMap<>();
	
	Money reduce(Expression source, String toCurrency) {
		return source.reduce(this, toCurrency);
	}
	
	public int rate(String from, String to) {
		if (from.equals(to)) {
			return 1;
		}
		
		return rates.get(new Pair(from, to));
	}

	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), rate);
	}
}

package xie.stanley.training;

public class Dollar extends Money {
	private String currency;

	public Dollar(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public String currency() {
		return currency;
	}

	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

}

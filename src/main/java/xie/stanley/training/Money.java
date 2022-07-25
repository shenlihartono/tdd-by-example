package xie.stanley.training;

public abstract class Money {
	protected int amount;

	public abstract String currency();

	public abstract Money times(int multiplier);

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && this.getClass().equals(object.getClass());
	}

}

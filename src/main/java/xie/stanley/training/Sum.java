package xie.stanley.training;

public class Sum implements Expression {
	private Expression augend;
	private Expression addend;

	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}
	
	@Override
	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}

	@Override
	public Expression plus(Expression addend) {
		return null;
	}

	public Expression getAugend() {
		return augend;
	}

	public Expression getAddend() {
		return addend;
	}
}

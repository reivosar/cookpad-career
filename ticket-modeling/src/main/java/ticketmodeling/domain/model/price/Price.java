package ticketmodeling.domain.model.price;

import java.math.BigDecimal;
import java.util.Currency;

import ticketmodeling.common.domain.model.ValueObject;
import ticketmodeling.common.domain.model.primitive.Money;

public class Price extends ValueObject<Price>
{
	final Money money;

	public Price(Money money) {
		this.money = money;
	}

	public Price(BigDecimal decimal, Currency currency) {
		this.money = new Money(decimal, currency);
	}
}

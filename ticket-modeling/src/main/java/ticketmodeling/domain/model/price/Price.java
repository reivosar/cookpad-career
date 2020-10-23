package ticketmodeling.domain.model.price;

import java.math.BigDecimal;
import java.util.Currency;

import reivosar.common.domain.model.money.Money;
import reivosar.common.domain.model.ValueObject;

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

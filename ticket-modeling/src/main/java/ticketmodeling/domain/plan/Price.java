package ticketmodeling.domain.plan;

import java.math.BigDecimal;
import java.util.Currency;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.common.domain.shared.primitive.Money;

public class Price extends ValueObject<Price>
{
	final Money money;

	public Price(BigDecimal decimal, Currency currency) {
		this.money = new Money(decimal, currency);
	}
}

package ticketmodeling.domain.plan;

import java.math.BigDecimal;
import java.util.Currency;

import ticketmodeling.common.domain.shared.ValueObject;

public class Price extends ValueObject<Price>
{
	final BigDecimal money;
	final Currency currency;

	public Price(BigDecimal money, Currency currency) {
		this.money    = money;
		this.currency = currency;
	}
}

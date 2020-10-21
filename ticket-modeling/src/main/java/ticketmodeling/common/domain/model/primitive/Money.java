package ticketmodeling.common.domain.model.primitive;

import java.math.BigDecimal;
import java.util.Currency;

import ticketmodeling.common.domain.model.ValueObject;

public class Money extends ValueObject<Money>
{
	final BigDecimal decimal;
	final Currency currency;

	public Money(int intValue, Currency currency) {
		this.decimal  = BigDecimal.valueOf(intValue);
		this.currency = currency;
	}

	public Money(BigDecimal decimal, Currency currency) {
		this.decimal  = decimal;
		this.currency = currency;
	}
}

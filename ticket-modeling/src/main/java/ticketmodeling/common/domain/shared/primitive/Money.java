package ticketmodeling.common.domain.shared.primitive;

import java.math.BigDecimal;
import java.util.Currency;

import ticketmodeling.common.domain.shared.ValueObject;

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

package ticketmodeling.domain.price.audience;

import java.util.Currency;
import java.util.Locale;

import ticketmodeling.common.domain.shared.primitive.Money;
import ticketmodeling.domain.price.Price;
import ticketmodeling.domain.price.PriceTable;

abstract class PriceTableTemplate implements PriceTable
{
	@Override
	public final Price weekdayNormalPrice() {
		return new Price(getMoeny(weekdayNormalPrimitivePrice()));
	}

	protected abstract int weekdayNormalPrimitivePrice();

	@Override
	public final Price weekdayLateShowPrice() {
		return new Price(getMoeny(weekdayLateShowPrimitivePrice()));
	}

	protected abstract int weekdayLateShowPrimitivePrice();

	@Override
	public final Price holidayNormalPrice() {
		return new Price(getMoeny(holidayNormalPrimitivePrice()));
	}

	protected abstract int holidayNormalPrimitivePrice();

	@Override
	public final Price holidayLateShowPrice() {
		return new Price(getMoeny(holidayLateShowPrimitivePrice()));
	}

	protected abstract int holidayLateShowPrimitivePrice();

	@Override
	public final Price movieDayPrice() {
		return new Price(getMoeny(movieDayPrimitivePrice()));
	}

	protected abstract int movieDayPrimitivePrice();

	private Money getMoeny(int value) {
		return new Money(value, getCurrency());
	}

	public Currency getCurrency() {
		return Currency.getInstance(Locale.JAPAN);
	}
}

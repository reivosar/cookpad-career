package ticketmodeling.domain.audience.price;

import java.util.Currency;
import java.util.Locale;

import ticketmodeling.common.domain.shared.primitive.Money;
import ticketmodeling.domain.price.DateAndTimePriceTable;
import ticketmodeling.domain.price.Price;

abstract class PriceTableTemplate implements DateAndTimePriceTable
{
	@Override
	public final Price weekdayNormalPrice() {
		return new Price(getMoeny(weekdayNormalPrimitivePrice()));
	}

	protected abstract int weekdayNormalPrimitivePrice();

	@Override
	public final Price weekdayLatePrice() {
		return new Price(getMoeny(weekdayLatePrimitivePrice()));
	}

	protected abstract int weekdayLatePrimitivePrice();

	@Override
	public final Price holidayNormalPrice() {
		return new Price(getMoeny(holidayNormalPrimitivePrice()));
	}

	protected abstract int holidayNormalPrimitivePrice();

	@Override
	public final Price holidayLatePrice() {
		return new Price(getMoeny(holidayLatePrimitivePrice()));
	}

	protected abstract int holidayLatePrimitivePrice();

	@Override
	public final Price movieDayPrice() {
		return new Price(getMoeny(movieDayPrimitivePrice()));
	}

	protected abstract int movieDayPrimitivePrice();

	private Money getMoeny(int value) {
		return new Money(value, getCurrency());
	}

	protected Currency getCurrency() {
		return Currency.getInstance(Locale.JAPAN);
	}
}

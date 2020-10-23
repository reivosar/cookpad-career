package ticketmodeling.domain.model.audience.price;

import java.util.Currency;
import java.util.Locale;

import reivosar.common.domain.model.money.Money;
import ticketmodeling.domain.model.price.DateAndTimePriceTable;
import ticketmodeling.domain.model.price.Price;

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

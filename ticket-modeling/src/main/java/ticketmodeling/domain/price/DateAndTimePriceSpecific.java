package ticketmodeling.domain.price;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.common.domain.shared.primitive.HourMinute;
import ticketmodeling.common.domain.shared.primitive.YearMonthDay;

public class DateAndTimePriceSpecific extends ValueObject<DateAndTimePriceSpecific>
{
	private final DateAndTimePriceTable priceTable;
	private final DateAndTimePriceType priceType;

	public DateAndTimePriceSpecific(
		DateAndTimePriceTable priceTable,
		YearMonthDay ymd,
		HourMinute hm)
	{
		this.priceTable = priceTable;
		this.priceType  = DateAndTimePriceType.of(ymd, hm);
	}

	public Price calcPrice() {
		switch (priceType) {
		case MOVIEDAY_PRICE:
			return priceTable.movieDayPrice();
		case WEEKDAY_NORMAL_PRICE:
			return priceTable.weekdayNormalPrice();
		case WEEKDAY_LATE_PRICE:
			return priceTable.weekdayLatePrice();
		case HOLIDAY_NORMAL_PRICE:
			return priceTable.holidayNormalPrice();
		case HOLIDAY_LATE_PRICE:
			return priceTable.holidayLatePrice();
		}
		throw new IllegalStateException();
	}
}

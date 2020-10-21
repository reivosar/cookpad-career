package ticketmodeling.domain.model.price;

import ticketmodeling.common.domain.model.primitive.HourMinute;
import ticketmodeling.common.domain.model.primitive.YearMonthDay;

public enum DateAndTimePriceType
{
	WEEKDAY_NORMAL_PRICE,
	WEEKDAY_LATE_PRICE,
	HOLIDAY_NORMAL_PRICE,
	HOLIDAY_LATE_PRICE,
	MOVIEDAY_PRICE;

	public static DateAndTimePriceType of (YearMonthDay ymd, HourMinute hm) {
		if (ymd.equalsDay(1))
			return MOVIEDAY_PRICE;

		if (ymd.isWeekend())
			return hm.isAfter(new HourMinute(20, 00)) ?
					HOLIDAY_LATE_PRICE :
					HOLIDAY_NORMAL_PRICE;

		return hm.isAfter(new HourMinute(20, 00)) ?
				WEEKDAY_LATE_PRICE:
				WEEKDAY_NORMAL_PRICE;
	}
}

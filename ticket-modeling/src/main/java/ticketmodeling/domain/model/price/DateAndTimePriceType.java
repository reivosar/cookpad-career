package ticketmodeling.domain.model.price;

import reivosar.common.domain.model.time.HourMinute;
import reivosar.common.domain.model.time.YearMonthDay;

public enum DateAndTimePriceType
{
	WEEKDAY_NORMAL_PRICE,
	WEEKDAY_LATE_PRICE,
	WEEKDAY_MOVIEDAY_PRICE,
	HOLIDAY_NORMAL_PRICE,
	HOLIDAY_LATE_PRICE,
	HOLIDAY_MOVIEDAY_PRICE;

	public static DateAndTimePriceType of (YearMonthDay ymd, HourMinute hm) {
		if (ymd.equalsDay(1)) {
			if (ymd.isDayOff())
				return HOLIDAY_MOVIEDAY_PRICE;
			return WEEKDAY_MOVIEDAY_PRICE;
		}

		boolean lateHourMinute = isLateHourMinute(hm);
		if (ymd.isDayOff())
			return lateHourMinute ? HOLIDAY_LATE_PRICE : HOLIDAY_NORMAL_PRICE;

		return lateHourMinute ? WEEKDAY_LATE_PRICE : WEEKDAY_NORMAL_PRICE;
	}

	private static boolean isLateHourMinute(HourMinute hm) {
		return hm.isAfterThan(new HourMinute(20, 00));
	}
}

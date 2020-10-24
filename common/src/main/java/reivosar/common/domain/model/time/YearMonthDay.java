package reivosar.common.domain.model.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

import reivosar.common.domain.model.ValueObject;
import reivosar.common.domain.model.time.holiday.JapaneseHolidays;

public class YearMonthDay extends ValueObject<YearMonthDay> {
	final Integer year;
	final Integer month;
	final Integer day;

	private YearMonthDay(Integer year, Integer month, Integer day) {
		this.year  = year;
		this.month = month;
		this.day   = day;
	}

	private YearMonthDay(String year, String month, String day) {
		this(Integer.parseInt(year), Integer.parseInt(month) ,Integer.parseInt(day));
	}

	public static YearMonthDay of(Integer year, Integer month, Integer day) {
		return new YearMonthDay(year, month, day);
	}

	public static YearMonthDay fromSlashFormat(String yyyymmdd) {
		if (yyyymmdd == null || yyyymmdd.split("/").length != 3) {
			throw new IllegalArgumentException(
				"The format of the argument string must be in yyyy/MM/dd format. parameter:" + yyyymmdd);
		}
		final String[] splitedStr = yyyymmdd.split("/");
		return new YearMonthDay(splitedStr[0], splitedStr[1], splitedStr[2]);
	}

	public DayOfWeek toDayOfWeek() {
		final DayOfWeek result = DayOfWeek.from(toLocalDate());
		return result;
	}

	public LocalDate toLocalDate() {
		return LocalDate.of(year, month, day);
	}

	public boolean equalsYear(int year) {
		return this.year.equals(year);
	}

	public boolean equalsMonth(int month) {
		return this.month.equals(month);
	}

	public boolean equalsDay(int day) {
		return this.day.equals(day);
	}

	public boolean isHoliday () {
		return JapaneseHolidays.of(this).isPresent();
	}

	public boolean isWeekend() {
		final DayOfWeek dayOfWeek = toDayOfWeek();
		return dayOfWeek == DayOfWeek.SUNDAY ||
				dayOfWeek == DayOfWeek.SATURDAY;
	}
}

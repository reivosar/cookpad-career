package reivosar.common.domain.model.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

import reivosar.common.domain.model.ValueObject;

public class YearMonthDay extends ValueObject<YearMonthDay> {
	final Integer year;
	final Integer month;
	final Integer day;

	public YearMonthDay(Integer year, Integer month, Integer day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public DayOfWeek toDayOfWeek() {
		DayOfWeek result = DayOfWeek.from(toLocalDate());
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

	public boolean isWeekend() {
		DayOfWeek dayOfWeek = toDayOfWeek();
		return dayOfWeek == DayOfWeek.SUNDAY ||
				dayOfWeek == DayOfWeek.SATURDAY;
	}
}

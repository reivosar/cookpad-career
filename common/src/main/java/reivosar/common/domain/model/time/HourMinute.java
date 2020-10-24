package reivosar.common.domain.model.time;

import java.time.LocalTime;

import reivosar.common.domain.model.ValueObject;

public class HourMinute extends ValueObject<HourMinute>
{
	final Integer hour;
	final Integer minute;

	public HourMinute(int hour, int minute) {
		this.hour   = hour;
		this.minute = minute;
	}

	public LocalTime toLocalTime() {
		return LocalTime.of(hour, minute);
	}

	public boolean equalsHour(int hour) {
		return this.hour.equals(hour);
	}

	public boolean equalsMinute(int minute) {
		return this.minute.equals(minute);
	}

	public boolean isBefore(HourMinute hm) {
		return toLocalTime().isBefore(hm.toLocalTime());
	}

	public boolean isBeforeThan(HourMinute hm) {
		return toLocalTime().compareTo(hm.toLocalTime()) <= 0;
	}

	public boolean isAfter(HourMinute hm) {
		return toLocalTime().isAfter(hm.toLocalTime());
	}

	public boolean isAfterThan(HourMinute hm) {
		return toLocalTime().compareTo(hm.toLocalTime()) >= 0;
	}
}

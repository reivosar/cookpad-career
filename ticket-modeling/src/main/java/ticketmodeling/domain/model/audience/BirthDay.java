package ticketmodeling.domain.model.audience;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import reivosar.common.domain.model.time.YearMonthDay;
import reivosar.common.domain.model.ValueObject;

public class BirthDay extends ValueObject<BirthDay>
{
	final YearMonthDay yearMonthDay;

	public BirthDay(YearMonthDay yearMonthDay) {
		this.yearMonthDay = yearMonthDay;
	}

	public boolean isOverAge(int age) {
		return age() > age;
	}

	public int age() {
	    final LocalDate birthday = yearMonthDay.toLocalDate();
	    final LocalDate today    = LocalDate.now();
	    return (int)ChronoUnit.YEARS.between(birthday, today);
	}
}

package ticketmodeling.domain.model.audience;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ticketmodeling.common.domain.model.ValueObject;
import ticketmodeling.common.domain.model.primitive.YearMonthDay;

public class BirthDay extends ValueObject<BirthDay>
{
	public static BirthDay NONE = new BirthDay(new YearMonthDay(9999, 12, 31));

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
	    long duration = ChronoUnit.YEARS.between(birthday, today);
	    return (int)duration;
	}
}

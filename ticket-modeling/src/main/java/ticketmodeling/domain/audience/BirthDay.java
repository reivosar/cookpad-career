package ticketmodeling.domain.audience;

import ticketmodeling.domain.shared.ValueObject;
import ticketmodeling.domain.shared.YearMonthDay;

public class BirthDay extends ValueObject<BirthDay>
{
	final YearMonthDay yearMonthDay;

	public BirthDay(YearMonthDay yearMonthDay) {
		this.yearMonthDay = yearMonthDay;
	}
}

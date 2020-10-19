package ticketmodeling.domain.audience;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.common.domain.shared.primitive.YearMonthDay;

public class BirthDay extends ValueObject<BirthDay>
{
	final YearMonthDay yearMonthDay;

	public BirthDay(YearMonthDay yearMonthDay) {
		this.yearMonthDay = yearMonthDay;
	}
}

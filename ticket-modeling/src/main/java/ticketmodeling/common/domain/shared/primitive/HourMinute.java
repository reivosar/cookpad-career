package ticketmodeling.common.domain.shared.value;

import ticketmodeling.common.domain.shared.ValueObject;

public class HourMinute extends ValueObject<HourMinute>
{
	final String hour;
	final String minute;

	public HourMinute(String hour, String minute) {
		this.hour   = hour;
		this.minute = minute;
	}
}

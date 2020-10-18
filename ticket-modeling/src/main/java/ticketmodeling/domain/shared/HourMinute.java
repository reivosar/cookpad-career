package ticketmodeling.domain.shared;

public class HourMinute extends ValueObject<HourMinute>
{
	final String hour;
	final String minute;

	public HourMinute(String hour, String minute) {
		this.hour   = hour;
		this.minute = minute;
	}
}

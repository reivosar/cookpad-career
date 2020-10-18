package ticketmodeling.domain.shared;

public class YearMonthDay extends ValueObject<YearMonthDay>
{
	final String year;
	final String month;
	final String day;

	public YearMonthDay(String year, String month, String day) {
		this.year  = year;
		this.month = month;
		this.day   = day;
	}
}

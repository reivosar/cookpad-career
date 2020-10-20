package ticketmodeling.domain.price;

public interface DateAndTimePriceTable
{
	Price weekdayNormalPrice();

	Price weekdayLatePrice();

	Price holidayNormalPrice();

	Price holidayLatePrice();

	Price movieDayPrice();
}

package ticketmodeling.domain.price;

public interface PriceTable
{
	Price weekdayNormalPrice();

	Price weekdayLateShowPrice();

	Price holidayNormalPrice();

	Price holidayLateShowPrice();

	Price movieDayPrice();
}

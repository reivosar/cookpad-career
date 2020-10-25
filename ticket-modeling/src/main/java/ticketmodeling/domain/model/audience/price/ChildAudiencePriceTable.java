package ticketmodeling.domain.model.audience.price;

import ticketmodeling.domain.model.price.DateAndTimePriceTableTemplate;

public class ChildAudiencePriceTable extends DateAndTimePriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 1000;
	}

	@Override
	protected int weekdayLatePrimitivePrice() {
		return 1000;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 1000;
	}

	@Override
	protected int holidayLatePrimitivePrice() {
		return 1000;
	}

	@Override
	protected int weekdayMovieDayPrimitivePrice() {
		return 1000;
	}
}

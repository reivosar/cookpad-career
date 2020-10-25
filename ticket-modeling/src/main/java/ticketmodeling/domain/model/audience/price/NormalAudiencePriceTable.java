package ticketmodeling.domain.model.audience.price;

import ticketmodeling.domain.model.price.DateAndTimePriceTableTemplate;

public class NormalAudiencePriceTable extends DateAndTimePriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 1800;
	}

	@Override
	protected int weekdayLatePrimitivePrice() {
		return 1300;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 1800;
	}

	@Override
	protected int holidayLatePrimitivePrice() {
		return 1300;
	}

	@Override
	protected int movieDayPrimitivePrice() {
		return 1100;
	}
}

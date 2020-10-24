package ticketmodeling.domain.model.audience.price;

import ticketmodeling.domain.model.price.PriceTableTemplate;

public class HandicappedAudiencePriceTable extends PriceTableTemplate
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
	protected int movieDayPrimitivePrice() {
		return 1000;
	}
}

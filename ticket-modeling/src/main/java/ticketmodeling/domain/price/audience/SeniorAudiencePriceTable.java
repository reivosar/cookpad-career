package ticketmodeling.domain.price.audience;

public class SeniorAudiencePriceTable extends PriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 1100;
	}

	@Override
	protected int weekdayLateShowPrimitivePrice() {
		return 1100;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 1100;
	}

	@Override
	protected int holidayLateShowPrimitivePrice() {
		return 1100;
	}

	@Override
	protected int movieDayPrimitivePrice() {
		return 1100;
	}
}

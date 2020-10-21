package ticketmodeling.domain.model.audience.price;

public class SeniorAudiencePriceTable extends PriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 1100;
	}

	@Override
	protected int weekdayLatePrimitivePrice() {
		return 1100;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 1100;
	}

	@Override
	protected int holidayLatePrimitivePrice() {
		return 1100;
	}

	@Override
	protected int movieDayPrimitivePrice() {
		return 1100;
	}
}

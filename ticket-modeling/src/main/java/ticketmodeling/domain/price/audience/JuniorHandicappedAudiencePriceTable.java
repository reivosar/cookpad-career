package ticketmodeling.domain.price.audience;

public class JuniorHandicappedAudiencePriceTable extends PriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 900;
	}

	@Override
	protected int weekdayLateShowPrimitivePrice() {
		return 900;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 900;
	}

	@Override
	protected int holidayLateShowPrimitivePrice() {
		return 900;
	}

	@Override
	protected int movieDayPrimitivePrice() {
		return 900;
	}
}


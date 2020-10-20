package ticketmodeling.domain.audience.price;

public class JuniorHandicappedAudiencePriceTable extends PriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 900;
	}

	@Override
	protected int weekdayLatePrimitivePrice() {
		return 900;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 900;
	}

	@Override
	protected int holidayLatePrimitivePrice() {
		return 900;
	}

	@Override
	protected int movieDayPrimitivePrice() {
		return 900;
	}
}

